package com.bookstore.douaes.controller;

import com.bookstore.douaes.model.CartItem;
import com.bookstore.douaes.model.User;
import com.bookstore.douaes.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cart")
public class CartController {

    @Autowired
    private CartService cartService;

    @GetMapping
    public List<CartItem> getCart(@AuthenticationPrincipal User user) {
        return cartService.getCart(user);
    }


    @DeleteMapping("/items/{itemId}")
    public void deleteItem(@PathVariable Long itemId) {
        cartService.deleteItem(itemId);
    }
}