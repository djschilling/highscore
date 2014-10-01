package de.davidschilling.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
* David Schilling - davejs92@gmail.com
*/
@Controller
@RequestMapping(value = "/users")
public class UserController {

    private UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @RequestMapping(value = "/{username}", method = RequestMethod.GET)
    public String getUser(@PathVariable String username, Model model) {
        User user = userRepository.findByUsername(username);
        model.addAttribute("user", user);
        return "user";
    }

    @RequestMapping(value = "/initial", method = RequestMethod.GET)
    public String initial() {
        userRepository.save(new User("mama", "mama"));
        userRepository.save(new User("david", "david"));
        userRepository.save(new User("winfried", "winfried"));
        userRepository.save(new User("eva", "eva"));
        userRepository.save(new User("raphael", "raphael"));
        userRepository.save(new User("jessica", "jessica"));
        return "redirect:/";
    }

}
