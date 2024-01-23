package org.example.service;

import org.example.dto.Book;
import org.example.entity.BookEntity;

public interface BookSevice {
     void addBook(Book book);
    Iterable<BookEntity> getBooks();

    boolean deleteBook(Long id);

}
