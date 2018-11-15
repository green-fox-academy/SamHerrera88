package com.greenfoxacademy.Repository;

import com.greenfoxacademy.Model.Todo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TodoRepo extends CrudRepository<Todo, Long> {
    List<Todo> findByDoneFalse();

    List<Todo> findByDoneTrue();
}
