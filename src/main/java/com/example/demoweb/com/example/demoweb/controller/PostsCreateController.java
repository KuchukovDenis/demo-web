package com.example.demoweb.com.example.demoweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class PostsCreateController {
    @RequestMapping(path = "new", method = RequestMethod.GET)
    public String create(Model model) {
        model.addAttribute("appName", "Моё супеdhfshfsdklfр приложение");
       // model.addAttribute("posts", postsService.listAllPosts());
        return "create";
    }
    @RequestMapping(path = "new", method = RequestMethod.POST)
    public String doCreate(@ModelAttribute("text") String text) {
        return "redirect:/";
    }
}
