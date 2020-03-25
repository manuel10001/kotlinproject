package ch.library


fun main() {
    val book1 = Book("Harry Potter 1", "J.K. Rowling", "Fantasy", 1)
    val book2 = Book("Barry Propper", "Rollo", "Roman", 2)
    val book3 = Book("Gregs Tagebuch", "Some Guy", "Comic", 3)
    val book4 = Book("Hunger Games", "Somebody", "Action", 4)
    val book5 = Book("All about the Galaxy", "NASA", "Space", 5)

    val lib1 = Library()

    lib1.addBook(book1)

    val bookList = arrayListOf(book2, book3, book4, book5)
    lib1.addBookList(bookList)

    println(lib1.getBookByIndex(0).title)
    println(lib1.getBookByIsbn(1).title)

    lib1.print()
    lib1.removeBookByIndex(1)
    lib1.removeBookByIsbn(3)
    lib1.print()

}