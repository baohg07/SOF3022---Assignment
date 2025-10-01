package poly.assignment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthController {

    @GetMapping("/login")
    public String loginForm() {
        return "login"; // trả về login.html
    }
    @GetMapping("/signup")
    public String signupForm() {
        return "signup"; // trả về signup.html
    }
}