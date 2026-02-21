package com.bookstore.douaes.dto;

public class AddToCartRequest {

    private Long bookId;
    private int quantity;

    public AddToCartRequest() {
    }

    public AddToCartRequest(Long bookId, int quantity) {
        this.bookId = bookId;
        this.quantity = quantity;
    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}