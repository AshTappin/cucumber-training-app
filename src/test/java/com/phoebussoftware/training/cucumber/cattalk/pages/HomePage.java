package com.phoebussoftware.training.cucumber.cattalk.pages;

import org.fluentlenium.core.FluentPage;
import org.fluentlenium.core.domain.FluentWebElement;

public class HomePage extends FluentPage {

  private FluentWebElement welcomeText;

  public String getWelcomeText() {
    return welcomeText.getText();
  }

  @Override
  public String getUrl() {
    return "/welcome";
  }

}
