package com.phoebussoftware.training.cucumber.cattalk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.phoebussoftware.training.cucumber.cattalk.model.ToDo;
import com.phoebussoftware.training.cucumber.cattalk.service.ToDoService;

@Controller
@SessionAttributes("name")
public class ToDoController {

  @Autowired
  private ToDoService service;

  @RequestMapping(value = "/list-todos", method = RequestMethod.GET)
  public String listToDos(final ModelMap model) {

    String name = (String) model.get("name");
    List<ToDo> todos = service.retrieveToDosForUser(name);
    model.put("todos", todos);
    return "welcome";
  }

}
