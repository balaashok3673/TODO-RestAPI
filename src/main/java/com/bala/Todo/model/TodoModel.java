package com.bala.Todo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "task")
public class TodoModel {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "task_name" , nullable = false , unique = true)
    private String name;
    @Column(name = "task_description" , nullable = false)
    private String description;
    @Column(name = "isTask_completed" , nullable = false)
    private boolean taskCompleted;

    public TodoModel(){
        // deafault constructor
    }

    public TodoModel(String name , String description , boolean taskCompleted){
        this.name=name;
        this.description=description;
        this.taskCompleted=taskCompleted;
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isTaskCompleted() {
        return taskCompleted;
    }

    public void setTaskCompleted(boolean taskCompleted) {
        this.taskCompleted = taskCompleted;
    }



}
