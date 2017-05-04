package sample.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Viktor_Artemov on 5/4/2017.
 */

@Controller
public class MyController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String printWelcome(Model model) {

        return "welcome";
    }
}
