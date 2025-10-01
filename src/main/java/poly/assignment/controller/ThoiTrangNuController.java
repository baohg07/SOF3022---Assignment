package poly.assignment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ThoiTrangNuController {
    // Giao diện chính quần áo nữ
    @GetMapping("/thoitrangnu")
    public String trangNu(Model model) {
        model.addAttribute("title", "Thời Trang Nữ");
        return "ThoiTrangNu"; // load ThoiTrangNu.html
    }
}
