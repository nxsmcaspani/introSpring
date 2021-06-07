package fr.wcs.introSpring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WildController {

    @GetMapping("/atelier")
    public String getWizards() {
        return "atelier.html";
    }

}
