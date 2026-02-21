package com.bookstore.douaes.controller;


import com.bookstore.douaes.model.Book;
import com.bookstore.douaes.service.AdminService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/admin/books")
@PreAuthorize("hasRole('ADMIN')")
public class AdminController {
    private final AdminService adminService;
    public AdminController(AdminService adminService) { this.adminService = adminService; }

    @PostMapping
    public Book addBook(@RequestBody Book book) {
        return adminService.addBook(book);
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id) {
        adminService.deleteBook(id);
    }
}