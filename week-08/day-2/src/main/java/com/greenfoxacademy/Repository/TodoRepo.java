package com.greenfoxacademy.Repository;

import com.greenfoxacademy.Model.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepo extends CrudRepository<Todo, Long> {

}
