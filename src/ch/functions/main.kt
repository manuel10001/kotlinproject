package ch.functions

import java.math.BigInteger

fun main() {
    println(11.minusTen())

    println(20 minusValue 10) //only possible with infix functions
    println(20.minusValue(10))

    println(getFibonacciNumber(10000, BigInteger("1"), BigInteger("0")))

}

//adds a function to the class Int
fun Int.minusTen(): Int {
    return this - 10
}

infix fun Int.minusValue(number: Int): Int {
    return this - number
}

//tailrec prevents stackoverflow
tailrec fun getFibonacciNumber(index: Int, number1: BigInteger, number2: BigInteger): BigInteger {
    if (index == 0) {
        return number2
    } else {
        return getFibonacciNumber(index - 1, number1 + number2, number1)
    }
}