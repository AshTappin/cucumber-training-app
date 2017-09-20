package com.phoebussoftware.training.cucumber.cattalk.steps;

import static java.nio.file.Files.exists;
import static org.junit.Assert.assertEquals;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.fluentlenium.core.FluentAdapter;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.phoebussoftware.training.cucumber.cattalk.pages.HomePage;
import com.phoebussoftware.training.cucumber.cattalk.pages.LoginPage;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps extends FluentAdapter {

  private WebDriver webDriver;

  @Page
  private LoginPage loginPage;

  @Page
  private HomePage homePage;

  @Before
  public void setup() {

    Path firefox = Paths.get("target/firefox/FirefoxPortable.exe").toAbsolutePath();

    if (exists(firefox)) {
      System.setProperty("webdriver.firefox.bin", firefox.toString());
    } else {
      System.out.println("Cannot use firefox browser binary");
    }

    webDriver = new FirefoxDriver();

    initFluent(webDriver).withDefaultUrl("http://localhost:8080");
    initTest();

    goTo(loginPage);
  }

  @Given("^I enter username \"([^\"]*)\"$")
  public void i_enter_username(final String userName) {
    loginPage.setUsername(userName);
  }

  @Given("^I enter password \"([^\"]*)\"$")
  public void i_enter_password(final String password) {
    loginPage.setPassword(password);
  }

  @When("^I login$")
  public void i_login() {
    loginPage.login();
  }

  @Then("^the home page should say \"([^\"]*)\"$")
  public void the_home_page_should_say(final String expectedMessage) {
    assertEquals(expectedMessage, homePage.getWelcomeText());
  }

  @After
  public void closeFireFox() {
    webDriver.close();
  }
}
