package poly.assignment.controller;

import poly.assignment.service.CartService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/cart")
public class CartController {

    private final CartService cartService;

    // Constructor Injection
    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    // Xem giỏ hàng
    @GetMapping
    public String viewCart(Model model) {
        model.addAttribute("cartItems", cartService.getCart());
        model.addAttribute("total", cartService.getTotalPrice());
        return "cart"; // => sẽ trả về file cart.html trong templates
    }

    // Thêm sản phẩm vào giỏ
    @PostMapping("/add")
    public String addItem(@RequestParam String name,
                          @RequestParam double price,
                          @RequestParam(defaultValue = "1") int qty) {
        cartService.addToCart(name, price, qty);
        return "redirect:/cart";
    }

    // Xóa sản phẩm khỏi giỏ
    @GetMapping("/remove/{name}")
    public String removeItem(@PathVariable String name) {
        cartService.removeFromCart(name);
        return "redirect:/cart";
    }
}
