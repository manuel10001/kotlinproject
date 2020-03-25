package ch.person

fun main(args: Array<String>) {
    val person1 = Person("Max", 17)
    val person2 = Person("Peter", 18)

    Person.compareAge(person1, person2)
    person1.checkLegalAge()
    person1.print()
}