package com.phoebussoftware.training.cucumber.cattalk.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ToDoService {

  public List<String> retrieveToDosForUser(final String name) {
    return Arrays.asList("Oh hey");
  }

}
