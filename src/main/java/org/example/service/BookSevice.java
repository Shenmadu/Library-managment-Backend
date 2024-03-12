package org.example.service;

import org.example.dto.Book;
import org.example.entity.BookEntity;

import java.util.List;

public interface BookSevice {
    void addBook(Book book);
    Iterable<BookEntity> getBooks();

    boolean deleteBook(Long id);
    Book getBookById(Long id);

    void addBookList(List<Book> bookList);

}
