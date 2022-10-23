package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthorizationController {

    @RequestMapping("/authorization")
    public String registration() {
        return "authorization.html";
    }


}
