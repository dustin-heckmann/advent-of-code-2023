package util

import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.http.*
import kotlinx.coroutines.runBlocking
import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.jsoup.nodes.Element

fun getPuzzleInputForDay(day: Int): String {
    val resourcePath = "/day${pad(day)}/input.txt"
    if (!resourceFileExists(resourcePath)) {
        return runBlocking {
            val input = fetchAdventOfCodeInput(day)
            writeResourceFile(resourcePath, input)
            input
        }
    }
    return readResourceFile(resourcePath)
}

fun getExampleInputForDay(day: Int): String {
    val resourcePath = "/examples/day${pad(day)}/input.txt"
    if (!resourceFileExists(resourcePath)) {
        return runBlocking {
            val input = fetchAdventOfCodeExampleInput(day)
            writeTestResourceFile(resourcePath, input)
            input
        }
    }
    return readResourceFile(resourcePath)
}

suspend fun fetchAdventOfCodeExampleInput(day: Int): String {
    val client = HttpClient(CIO)
    val response: HttpResponse = client.get("https://adventofcode.com/2023/day/$day")
    client.close()
    return extractLargestCodeTagContent(response.bodyAsText())
}

suspend fun fetchAdventOfCodeInput(day: Int): String {
    val client = HttpClient(CIO)
    val response: HttpResponse = client.get("https://adventofcode.com/2023/day/$day/input") {
        headers {
            append(
                HttpHeaders.Accept,
                "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7",
            )
            append(HttpHeaders.Cookie, readResourceFile("/cookie.txt"))
        }
    }
    client.close()
    return response.bodyAsText().trimEnd()
}

fun extractLargestCodeTagContent(html: String): String {
    val doc: Document = Jsoup.parse(html)
    val codeTags: List<Element> = doc.select("code").toList()
    return codeTags.maxByOrNull { it.text().length }?.text() ?: ""
}

private fun pad(day: Int) = day.toString().padStart(2, '0')
