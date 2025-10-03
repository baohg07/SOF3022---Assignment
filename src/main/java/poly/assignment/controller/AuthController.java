package poly.assignment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthController {

    @GetMapping("/fashion/signin")
    public String loginForm() {
        return "signin";
    }
    @GetMapping("/fashion/signin/signup")
    public String signupForm() {
        return "signup";
    }
}