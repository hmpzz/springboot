package cn.hadron.springboot.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HiController {
    @RequestMapping("/hi")
    public String hi() {
        return "Hi，Spring Boot 2.0 ！";
    }
}
