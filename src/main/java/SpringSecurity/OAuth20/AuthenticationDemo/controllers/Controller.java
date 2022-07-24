package SpringSecurity.OAuth20.AuthenticationDemo.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {
    @GetMapping("/")
    public String loginPage() {
        return "index";
    }

    @GetMapping("/protected")
    public String homePage() {
        return "index";
    }
}
