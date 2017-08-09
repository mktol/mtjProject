package maks.sample.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller for cheking security.
 */
@RestController
public class PingController {
    @RequestMapping("/rest/ping")
    public String getPing() {
        return "OK";
    }
}
