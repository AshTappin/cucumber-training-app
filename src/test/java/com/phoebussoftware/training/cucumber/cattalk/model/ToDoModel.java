package com.phoebussoftware.training.cucumber.cattalk.model;

import java.time.LocalDate;

public class ToDoModel {

  private String whatToDo;
  private LocalDate dateToBeDoneBy;
  private String status;

  public String getWhatToDo() {
    return whatToDo;
  }

  public void setWhatToDo(final String whatToDo) {
    this.whatToDo = whatToDo;
  }

  public LocalDate getDateToBeDoneBy() {
    return dateToBeDoneBy;
  }

  public void setDateToBeDoneBy(final LocalDate dateToBeDoneBy) {
    this.dateToBeDoneBy = dateToBeDoneBy;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(final String status) {
    this.status = status;
  }
}
