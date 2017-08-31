package com.remainder.controllers;

import com.remainder.models.Registration;
import com.remainder.models.data.RegistrationDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;

/**
 * Created by lisette on 3/8/17.
 */
@Controller
@RequestMapping("registration")
public class RegistrationController {

    @Autowired
    private RegistrationDao registrationDao;

    //displays registration form for users who are not registered
    @RequestMapping(value = "", method = RequestMethod.GET)
    public String displayRegistrationForm(Model model) {
        model.addAttribute(new Registration());
        model.addAttribute("title", "Registration Form");
        return "registration/add";
    }
    //processes the data entered. Registers user.
    @RequestMapping(value = "", method = RequestMethod.POST)
    public String processRegistrationForm(@ModelAttribute @Valid Registration newRegistration, Errors errors, Model model) {

        if(errors.hasErrors()) {
            model.addAttribute("title", "Register");
            return "registration/add";
        }
        registrationDao.save(newRegistration);
        return "redirect:";
    }
}

