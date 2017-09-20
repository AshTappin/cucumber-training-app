package com.phoebussoftware.training.cucumber.cattalk.model;

import java.time.LocalDate;

import com.phoebussoftware.training.cucumber.cattalk.model.enums.ToDoStatus;

public class ToDo {

  private String description;
  private LocalDate dateToBeDoneBy;
  private ToDoStatus status;

  public String getDescription() {
    return description;
  }

  public void setDescription(final String description) {
    this.description = description;
  }

  public LocalDate getDateToBeDoneBy() {
    return dateToBeDoneBy;
  }

  public void setDateToBeDoneBy(final LocalDate dateToBeDoneBy) {
    this.dateToBeDoneBy = dateToBeDoneBy;
  }

  public ToDoStatus getStatus() {
    return status;
  }

  public void setStatus(final ToDoStatus status) {
    this.status = status;
  }
}
