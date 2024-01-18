package org.example.service.impl;

import org.example.dto.Book;
import org.example.entity.BookEntity;
import org.example.repository.BookRepository;
import org.example.service.BookSevice;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookSevice {
    @Autowired
    BookRepository bookRepository;

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
}
