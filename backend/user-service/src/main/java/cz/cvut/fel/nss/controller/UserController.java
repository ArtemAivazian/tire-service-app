package cz.cvut.fel.nss.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping
    public String getMember() {
        return "Secured Endpoint :: GET - user controller";
    }

    @PostMapping
    public String post() {
        return "POST:: user controller";
    }
}
