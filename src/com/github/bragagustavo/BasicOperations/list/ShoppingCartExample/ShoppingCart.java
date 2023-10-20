package com.github.bragagustavo.BasicOperations.list.ShoppingCartExample;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    List<Item> shoppingCart;

    public ShoppingCart() {
        this.shoppingCart = new ArrayList<>();
    }

    public void addItem(String name, Double price, Integer ammount) {
        Item item = new Item(price, name, ammount);
        this.shoppingCart.add(item);
    }

    public void removeItem(String name) {
        List<Item> itemsToRemove = new ArrayList<>();
        if (!shoppingCart.isEmpty()) {
            for (Item i : shoppingCart) {
                if (i.getName().equalsIgnoreCase(name)) {
                    itemsToRemove.add(i);
                }
            }
            shoppingCart.removeAll(itemsToRemove);
        } else if (shoppingCart.isEmpty()) {
            System.out.println("Item nao existe no carrinho");
        }
    }

    public Double getTotalPrice() {
        Double totalValue = 0d;
        for (Item item : shoppingCart) {
            Double itemValue = item.getPrice() * item.getAmmount();
            totalValue += itemValue;
        }

        if (shoppingCart.isEmpty()) {
            System.out.println("A lista está vazia");
        }
        return totalValue;
    }

    public void showItems() {
        System.out.println(this.shoppingCart);
    }

    
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.addItem("RTX 4090", 20000.00, 1);
        cart.addItem("Ryzen 5", 4000.00, 1);
        System.out.println(cart.getTotalPrice());
        cart.showItems();
        cart.removeItem("RTX 4090");
        cart.showItems();

    }
}
