package poly.assignment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NewsController {

    @GetMapping("/news")
    public String news() {
        return "news";
    }

    @GetMapping("/news/featured")
    public String newsFeatured(Model model) {
        model.addAttribute("categoryTitle", "Bài Viết Nổi Bật");
        return "news-featured";
    }

    @GetMapping("/news/pantio")
    public String newsPantio(Model model) {
        model.addAttribute("categoryTitle", "Bản Tin PANTIO");
        return "news-pantio";
    }

    @GetMapping("/news/trends")
    public String newsTrends(Model model) {
        model.addAttribute("categoryTitle", "Xu Hướng Thời Trang");
        return "news-trends";
    }

    @GetMapping("/news/events")
    public String newsEvents(Model model) {
        model.addAttribute("categoryTitle", "Sự Kiện");
        return "news-events";
    }

    @GetMapping("/news/careers")
    public String newsCareers(Model model) {
        model.addAttribute("categoryTitle", "Tuyển Dụng");
        return "news-careers";
    }
}