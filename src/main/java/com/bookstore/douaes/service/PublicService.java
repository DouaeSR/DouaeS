package com.bookstore.douaes.service;

import com.bookstore.douaes.model.Book;
import com.bookstore.douaes.model.Category;
import com.bookstore.douaes.repository.BookRepository;
import com.bookstore.douaes.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PublicService {

    private final BookRepository bookRepository;
    private final CategoryRepository categoryRepository;

    // 1. List categories
    public Iterable<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    // 2. List books with pagination
    public Page<Book> getBooks(Pageable pageable) {
        return bookRepository.findAll(pageable);
    }

    // 3. Get book detail
    public Book getBookById(Long id) {
        return bookRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Book not found"));
    }
}