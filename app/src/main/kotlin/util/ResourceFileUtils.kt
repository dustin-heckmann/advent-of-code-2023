package util

import java.io.File
import kotlin.io.path.Path
import kotlin.io.path.absolutePathString

fun readResourceFile(path: String): String {
    return object {}
        .javaClass
        .getResourceAsStream(path)!!
        .bufferedReader()
        .readText()
}

internal fun writeResourceFile(resourcePath: String, content: String) {
    val filePath = Path("app/src/main/resources$resourcePath")
    val file = File(filePath.absolutePathString())
    file.parentFile.mkdirs()
    file.createNewFile()
    file.writeText(content)
}

internal fun writeTestResourceFile(resourcePath: String, content: String) {
    val filePath = Path("src/test/resources$resourcePath")
    val file = File(filePath.absolutePathString())
    file.parentFile.mkdirs()
    file.createNewFile()
    file.writeText(content)
}

internal fun resourceFileExists(path: String): Boolean {
    return object {}
        .javaClass
        .getResourceAsStream(path)
        ?.readAllBytes()
        ?.isNotEmpty()
        ?: false
}
