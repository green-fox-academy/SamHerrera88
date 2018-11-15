package com.greenfoxacademy.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Todo {
    public Todo() {
        this.title = title;
    }
public Todo(String title, Boolean done, Boolean urgent){
        this.title = title;
        this.done = done;
        this.urgent = urgent;

}
    @Id
    @GeneratedValue
    long id;

    String title;
    boolean urgent = true;
    boolean done = false;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isUrgent() {
        return urgent;
    }

    public void setUrgent(boolean urgent) {
        this.urgent = urgent;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public void updateTodos(){

    }
}

