package com.example.demo.service;


import com.example.demo.entity.Book;
import com.example.demo.repository.BookRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BookService {

    private final BookRepository bookRepository;


    public List<Book> getBooks() {
        return bookRepository.findAll();
    }

    public Book getBook(Integer id) {
        return bookRepository.findById(id).orElse(null);
    }
    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }
}
