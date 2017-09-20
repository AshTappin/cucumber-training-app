package com.phoebussoftware.training.cucumber.cattalk.service;

import static com.phoebussoftware.training.cucumber.cattalk.model.builders.ToDoBuilder.aToDo;
import static java.util.stream.Collectors.toList;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.phoebussoftware.training.cucumber.cattalk.model.ToDo;
import com.phoebussoftware.training.cucumber.cattalk.model.enums.ToDoStatus;

@Service
public class ToDoService {

  public List<ToDo> retrieveToDosForUser(final String name) {

    return Arrays.asList(aToDo()
        .withName("FelixTheCat")
        .withStatus(ToDoStatus.NOT_DONE)
        .withDescription("Annoy the dog")
        .withDateToBeDoneBy(LocalDate.of(2017, 10, 12))
        .build(),
        aToDo()
            .withName("FelixTheCat")
            .withStatus(ToDoStatus.NOT_DONE)
            .withDescription("Sleep for 20 hours")
            .withDateToBeDoneBy(LocalDate.of(2017, 10, 2))
            .build(),

        aToDo()
            .withName("TomCat")
            .withStatus(ToDoStatus.NOT_DONE)
            .withDescription("Sleep for 21 hours")
            .withDateToBeDoneBy(LocalDate.of(2017, 10, 2))
            .build())
        .stream()
        .filter(todo -> name.equalsIgnoreCase(todo.getName()))
        .collect(toList());
  }

}
