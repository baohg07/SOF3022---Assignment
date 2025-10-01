package poly.assignment.service;

import poly.assignment.model.CartItem;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CartService {
    private List<CartItem> cart = new ArrayList<>();

    public List<CartItem> getCart() {
        return cart;
    }

    public void addToCart(String name, double price, int qty) {
        for (CartItem item : cart) {
            if (item.getProductName().equals(name)) {
                item.setQuantity(item.getQuantity() + qty);
                return;
            }
        }
        cart.add(new CartItem(name, price, qty));
    }

    public void removeFromCart(String name) {
        cart.removeIf(item -> item.getProductName().equals(name));
    }

    public double getTotalPrice() {
        return cart.stream().mapToDouble(CartItem::getTotal).sum();
    }
}
