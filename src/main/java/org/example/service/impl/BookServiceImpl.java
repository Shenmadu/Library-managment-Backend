package org.example.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.dto.Book;
import org.example.entity.BookEntity;
import org.example.repository.BookRepository;
import org.example.service.BookSevice;
import org.modelmapper.ModelMapper;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookSevice {

    final BookRepository bookRepository;

    ModelMapper mapper;

    @Bean
    public void setup(){
        this.mapper=new ModelMapper();
    }

    @Override
    public void addBook(Book book) {
        BookEntity entity = mapper.map(book, BookEntity.class);
        bookRepository.save(entity);

    }

    @Override
    public List<BookEntity> getBooks() {
        return bookRepository.findAll();
    }
}
