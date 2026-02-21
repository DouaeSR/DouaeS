package com.bookstore.douaes.service;

import com.bookstore.douaes.model.Book;
import com.bookstore.douaes.model.CartItem;
import com.bookstore.douaes.model.User;
import com.bookstore.douaes.repository.BookRepository;
import com.bookstore.douaes.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartService {

    @Autowired
    private CartRepository cartRepository;
    @Autowired
    private BookRepository bookRepository;

    public List<CartItem> getCart(User user) {
        return cartRepository.findByUser(user);
    }

    public CartItem addItem(User user, Long bookId, int quantity) {
        Book book = bookRepository.findById(bookId)
                .orElseThrow(() -> new RuntimeException("Book not found"));
        CartItem item = new CartItem();
        item.setBook(book);
        item.setUser(user);
        item.setQuantity(quantity);
        return cartRepository.save(item);
    }

    public CartItem updateItem(Long itemId, int quantity) {
        CartItem item = cartRepository.findById(itemId)
                .orElseThrow(() -> new RuntimeException("Item not found"));
        item.setQuantity(quantity);
        return cartRepository.save(item);
    }

    public void deleteItem(Long itemId) {
        cartRepository.deleteById(itemId);
    }
}