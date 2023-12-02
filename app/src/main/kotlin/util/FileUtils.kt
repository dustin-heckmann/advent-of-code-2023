package util

fun readResourceFile(path: String): String {
    return object {}
        .javaClass
        .getResourceAsStream(path)!!
        .bufferedReader()
        .readText()
}
