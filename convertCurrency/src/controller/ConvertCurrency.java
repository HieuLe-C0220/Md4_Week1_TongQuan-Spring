package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ConvertCurrency {
    @GetMapping("/convert")
    public String convert(@RequestParam double x, Model model) {
        double amount = x*22000;
        model.addAttribute("amount",amount);
        return "index";
    }
}
