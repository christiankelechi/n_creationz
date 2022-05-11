package codeblaze.com.n_creationz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @GetMapping("/index")
    public String getHomePage(Model model){
        return "index";
    }
     @GetMapping("/about")
    public String getAboutPage(Model model){
        return "about";
    }
}
