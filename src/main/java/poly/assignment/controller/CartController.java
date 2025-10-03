package poly.assignment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class CartController {

    @RequestMapping("/fashion/cart")
    public String cart(){
        return "cart";
    }

}
