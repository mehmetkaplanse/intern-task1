package org.example;


import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> cartItems;

    public ShoppingCart() {
        this.cartItems = new ArrayList<>();
    }

    public void addItem(Item item) {
        boolean alreadyInCart = false;
        for (Item cartItem : cartItems) {
            if (cartItem.equals(item)) {
                alreadyInCart = true;
                break;
            }
        }

        if (alreadyInCart) {
            System.out.println("Bu ürün zaten sepette mevcut: " + item.getProductName());
        } else {
            cartItems.add(item);
            System.out.println("Ürün başarıyla eklendi: " + item.getProductName());
        }
    }

    public double calculateTotalPrice() {
        double totalPrice = 0.0;
        for (Item item : cartItems) {
            totalPrice += item.getSalePrice();
        }
        return totalPrice;
    }
}
