package com.example.demo.controller;



import com.example.demo.entity.Book;
import com.example.demo.service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
@AllArgsConstructor
public class BookController {
    private final BookService bookService;
    @GetMapping("")
    public ResponseEntity<?> getBooks() {
        List<Book> books = bookService.getBooks();
        return ResponseEntity.ok(books);
    }
    @PostMapping("/save")
    public ResponseEntity<?> saveBook(@RequestBody Book book) {
        Book savedBook = bookService.saveBook(book);
        return ResponseEntity.ok(savedBook);
    }
}
