package com.bookstore.douaes.repository;

import com.bookstore.douaes.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
