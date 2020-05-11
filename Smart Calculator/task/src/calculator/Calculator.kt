package calculator

import java.util.*

class Calculator {
    private val scanner = Scanner(System.`in`)

    fun start() {
        val result = parse(scanner.nextLine())
        println(result)
    }

    private fun parse(input: String): Long {
        return input.split(' ').map { it.toLong() }.sum()
    }

    private enum class Operation {
        Calculate,
        CreateVariable,
        Exit
    }
}