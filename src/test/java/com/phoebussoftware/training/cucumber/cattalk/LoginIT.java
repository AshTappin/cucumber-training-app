package com.phoebussoftware.training.cucumber.cattalk;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(strict = true, features = {"classpath:features/login.feature"})
public class LoginIT {

}
