package com.phoebussoftware.training.cucumber.cattalk.model.builders;

import java.time.LocalDate;

import com.phoebussoftware.training.cucumber.cattalk.model.ToDo;
import com.phoebussoftware.training.cucumber.cattalk.model.enums.ToDoStatus;

public class ToDoBuilder {
  private final ToDo toDo;

  private ToDoBuilder() {
    this.toDo = new ToDo();
  }

  public static ToDoBuilder aToDo() {
    return new ToDoBuilder();
  }

  public ToDoBuilder withDescription(final String description) {
    this.toDo.setDescription(description);
    return this;
  }

  public ToDoBuilder withDateToBeDoneBy(final LocalDate dateToBeDoneBy) {
    this.toDo.setDateToBeDoneBy(dateToBeDoneBy);
    return this;
  }

  public ToDoBuilder withStatus(final ToDoStatus status) {
    this.toDo.setStatus(status);
    return this;
  }

  public ToDoBuilder withName(final String name) {
    this.toDo.setName(name);
    return this;
  }

  public ToDo build() {
    return this.toDo;
  }


}
