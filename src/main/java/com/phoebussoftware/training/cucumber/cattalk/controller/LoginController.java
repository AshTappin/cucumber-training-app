package com.phoebussoftware.training.cucumber.cattalk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.phoebussoftware.training.cucumber.cattalk.service.LoginService;

@Controller
@SessionAttributes("name")
public class LoginController {

  @Autowired
  private LoginService service;

  @RequestMapping(value = "/login", method = RequestMethod.GET)
  public String showLoginPage(final ModelMap model) {
    return "login";
  }

  @RequestMapping(value = "/login", method = RequestMethod.POST)
  public String login(final ModelMap model, @RequestParam final String name, @RequestParam final String password) {

    boolean isValidUser = service.validateUser(name, password);

    if (!isValidUser) {
      model.put("errorMessage", "Invalid Credentials");
      return "login";
    }

    model.put("name", name);
    model.put("password", password);

    return "welcome";
  }

}
