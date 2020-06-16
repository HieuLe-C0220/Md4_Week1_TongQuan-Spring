package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
public class Dictionary {
    Map<String,String> dic = new HashMap<>();
    public String search(String word) {
        String result;
        result = dic.get(word);
        if (result == null) {
            result = "not found";
        }
        return result;
    }
    @GetMapping("/formDictionary")
    public String form() {
        return "formDictionary";
    }
    @PostMapping("/dictionary")
    public String translate(@RequestParam ("english") String word, Model model) {
        dic.put("hello","Xin chào");
        dic.put("book","Quyển sách");
        dic.put("Annotation","Chú thích");
        model.addAttribute("english",search(word));
        return "dictionary";
    }
}
