package com.example.dung1.something.api;

import com.example.dung1.something.dao.SomethingDao;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("something")
@RequiredArgsConstructor
public class SomethingController {

    private final SomethingDao dao;


    @GetMapping
    public String some(Model model) {
        model.addAttribute("hi", "test");
        model.addAttribute("tables", dao.findAll());
        return "something";
    }

    @GetMapping("else")
    public String elses() {
        return "something/else";
    }

}
