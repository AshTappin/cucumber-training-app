package com.phoebussoftware.training.cucumber.cattalk.pages;

import org.fluentlenium.core.FluentPage;
import org.fluentlenium.core.domain.FluentWebElement;

public class LoginPage extends FluentPage {

  private FluentWebElement name;
  private FluentWebElement password;
  private FluentWebElement loginButton;
  private FluentWebElement error;

  @Override
  public String getUrl() {
    return "/login";
  }

  public void setUsername(final String username) {
    this.name.text(username);
  }

  public void setPassword(final String password) {
    this.password.text(password);
  }

  public void login() {
    loginButton.click();
  }

  public String getErrorMessage() {
    return error.getText();
  }

}
