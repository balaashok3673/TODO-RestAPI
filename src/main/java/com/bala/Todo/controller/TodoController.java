package com.bala.Todo.controller;

import com.bala.Todo.model.TodoModel;
import com.bala.Todo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/task")
public class TodoController {


    private final TodoService todoService;

    public TodoController(TodoService todoService){
        this.todoService=todoService;
    }

    @GetMapping("/listTask")
    public List<TodoModel> listTask(){
        return todoService.listTask();
    }

    @PostMapping("/addTask")
    public String addTask(@RequestBody TodoModel todoModel){
        return todoService.addTask(todoModel);
    }

    @DeleteMapping("/deleteTask/{id}")
    public String deleteTask(@PathVariable Long id){
        return todoService.deleteTaskByID(id);
    }

    @PutMapping("/updateTask/{id}")
    public String updateTask(@PathVariable Long id , @RequestBody TodoModel todoModel){
        return todoService.updateTask(id , todoModel);
    }






}
