package ch.library

import java.lang.IllegalArgumentException

class Library() {
    //inititialize empty ArrayList
    var books: ArrayList<Book> = arrayListOf()

    fun addBook(book: Book) {
        books.add(book)
    }

    fun addBookList(bookList: ArrayList<Book>) {
        for (book in bookList) {
            books.add(book)
        }
    }

    fun removeBookByIsbn(bookIsbn: Int) {
        for(book in books) {
            if (book.isbn == bookIsbn) {
                books.remove(book)
                return
            }
        }
        throw IllegalArgumentException("Book ISBN: $bookIsbn does not exist")
    }

    fun removeBookByIndex(bookIndex: Int) {
        if (bookIndex >= books.size) {
            throw IllegalArgumentException("Index: $bookIndex does not exist")
        }
        books.removeAt(bookIndex)
    }

    fun getBookByIsbn(bookIsbn: Int): Book {
        for(book in books) {
            if (book.isbn == bookIsbn) {
                return book
            }
        }
        throw IllegalArgumentException("Book ISBN: $bookIsbn does not exist")
    }

    fun getBookByIndex(bookIndex: Int): Book {
        if (bookIndex >= books.size) {
            throw IllegalArgumentException("Index: $bookIndex does not exist")
        }
        return books[bookIndex]
    }

    fun print() {
        println("")
        println("This Library holds ${books.size} books")
        println("----------------------------------------")
        for(book in books) {
            println("${book.title} by ${book.author} (ISBN: ${book.isbn})")
            println("----------------------------------------")
            println("")
        }
    }
}