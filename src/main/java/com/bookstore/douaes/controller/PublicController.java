package com.bookstore.douaes.controller;

import com.bookstore.douaes.model.Book;
import com.bookstore.douaes.model.Category;
import com.bookstore.douaes.service.PublicService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/public")
@RequiredArgsConstructor
public class PublicController {

    private final PublicService publicService;

    // 1. GET /api/public/categories
    @GetMapping("/categories")
    public Iterable<Category> getCategories() {
        return publicService.getAllCategories();
    }

    // 2. GET /api/public/books?page=0&size=5
    @GetMapping("/books")
    public Page<Book> getBooks(Pageable pageable) {
        return publicService.getBooks(pageable);
    }

    // 3. GET /api/public/books/{id}
    @GetMapping("/books/{id}")
    public Book getBook(@PathVariable Long id) {
        return publicService.getBookById(id);
    }
}