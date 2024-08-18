package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.*;

@Controller
public class TestController {

    @GetMapping("/test")
    public String getTest(Model model) {
        model.addAttribute("info", "testInfo");
        return "test";
    }

    @GetMapping("/test/list")
    public String getTestList(Model model) {

        Map<String, Object> map1 = new HashMap<>();
        map1.put("id", 1);

        Map<String, Object> map2 = new HashMap<>();
        map2.put("id", 2);

        Map<String, Object> map3 = new HashMap<>();
        map2.put("id", null);

        List<Map<String, Object>> list = new ArrayList<>();
        list.add(map1);
        list.add(map2);
        list.add(map3);
        model.addAttribute("infoList", list);

        return "test-list";
    }
}
