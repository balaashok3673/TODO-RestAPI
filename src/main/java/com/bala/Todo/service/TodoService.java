package com.bala.Todo.service;

import com.bala.Todo.model.TodoModel;
import com.bala.Todo.repository.TodoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    private final TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }


    public String addTask(TodoModel todoModel){
        todoRepository.save(todoModel);
        return "Task has been saved successfully";
    }

    public List<TodoModel> listTask(){
        return todoRepository.findAll();
    }

    public String deleteTaskByID(Long id){
       todoRepository.deleteById(id);
       return "task has been deleted";
    }

    public String updateTask(Long id, TodoModel existingtask){
        TodoModel updatedTask = existingtask;
        updatedTask.setName(existingtask.getName());
        updatedTask.setDescription(existingtask.getDescription());
        updatedTask.setTaskCompleted(existingtask.isTaskCompleted());
        return "Task has been updated";
    }
}
