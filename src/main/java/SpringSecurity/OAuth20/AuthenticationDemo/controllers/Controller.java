package SpringSecurity.OAuth20.AuthenticationDemo.controllers;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;


@org.springframework.stereotype.Controller
public class Controller {
    @GetMapping("/")
    public String loginPage() {
        return "index";
    } // login page not loading on local host

//    @GetMapping("/")
//    public String getProtectedPage(Authentication authentication) {
//        if (authentication != null) {
//            System.out.println(authentication);
//        }
//        return "index";
//    }

    @GetMapping("/protected")
    public String homePage() {
        return "index";
    }
}
