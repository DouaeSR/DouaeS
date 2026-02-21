package com.bookstore.douaes.service;


import com.bookstore.douaes.model.Book;
import com.bookstore.douaes.repository.BookRepository;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
    private final BookRepository bookRepo;

    public AdminService(BookRepository bookRepo) {
        this.bookRepo = bookRepo;
    }

    public Book addBook(Book book) {
        return bookRepo.save(book);
    }

    public void deleteBook(Long id) {
        bookRepo.deleteById(id);
    }
}