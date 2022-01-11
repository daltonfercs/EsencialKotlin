package controlstructure

import kotlin.math.roundToInt

fun main() {
    val isLoggerIn = true
    when (isLoggerIn) {
        true -> println("usuario logueado")
        false -> println("usiario no logueado")
    }
    println()

    val userStatus = 13

    val userStatusString = when (userStatus) {
        0 -> "logger out"
        1 -> "logger In"
        -1 -> "Down"
        in 10..20 -> "Inactive for $userStatus min"
        else -> "not found"
    }
    println(userStatusString)
    println()

    val productPrices: Any   =   doubleArrayOf(15.99, 11.10, 45.49)
    when (productPrices) {
        is DoubleArray -> productPrices.sum().roundToInt().toString()
        is Double -> productPrices.roundToInt().toString()
    }
}
