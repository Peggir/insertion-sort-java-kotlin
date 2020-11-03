package kotlinSolution

fun main() {
    val input = intArrayOf(8, 3, 6, 1, 9, 20, 0)
    val output = insertionSort(input)
    println(output.contentToString())
}

fun insertionSort(input: IntArray): IntArray {
    for (j in 1 until input.size) {
        val key = input[j]
        var i = j - 1

        while (i >= 0 && input[i] > key) {
            input[i + 1] = input[i]
            i--
        }

        input[i + 1] = key
    }

    return input
}