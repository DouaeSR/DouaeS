package com.bookstore.douaes.repository;

import com.bookstore.douaes.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
