fun main(args: Array<String>) {
    var personObj = Person()
    personObj.name = "Manuel"
    personObj.age = 16
    personObj.print()
}

class Person {
    var name:String = ""
    var age:Int = 0

    fun print() {
        println("Name: " + this.name)
        println("Age: " + this.age)
    }
}
