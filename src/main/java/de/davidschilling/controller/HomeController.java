package de.davidschilling.controller;

import de.davidschilling.birthday.BirthdayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * David Schilling - davejs92@gmail.com
 */
@Controller
public class HomeController {

    private BirthdayService birthdayService;

    @Autowired
    public HomeController(BirthdayService birthdayService) {
        this.birthdayService = birthdayService;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String hello(Model model) {
        model.addAttribute("hasBirthday", birthdayService.hasBirthday());
        return "hello";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
        return "login";
    }
}
