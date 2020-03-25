class Person(var name: String, var age: Int) {

    fun print() {
        println("Name: $name")
        println("Age: $age")
    }

    companion object {
        fun compareAge(person1: Person, person2: Person) {
            if (person1.age > person2.age) {
                println("${person1.name} is older than ${person2.name}")
            } else {
                println("${person2.name} is older than ${person1.name}")
            }
        }
    }

    fun checkLegalAge() {
        when {
            age < 18 -> println("$name hasn't reached legal age")
            age >= 18 -> println("$name has reached legal age")
        }
    }
}