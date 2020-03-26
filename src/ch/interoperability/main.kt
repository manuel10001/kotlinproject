@file:JvmName("MyKotlinFile")

package ch.interoperability


fun main() {
    println(MyJavaFile.subtract(5,3))
}

fun add(a: Int, b: Int): Int {
    return a + b
}

@JvmOverloads
fun getVolume(length: Double, width: Double, height: Double = 10.0): Double {
    return length * width * height
}