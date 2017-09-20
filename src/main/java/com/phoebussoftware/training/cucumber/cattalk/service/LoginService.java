package com.phoebussoftware.training.cucumber.cattalk.service;

import org.springframework.stereotype.Service;

@Service
public class LoginService {

  public boolean validateUser(final String userid, final String password) {
    return userid.equalsIgnoreCase("FelixTheCat")
        && password.equalsIgnoreCase("I<3Sleep");
  }
}
