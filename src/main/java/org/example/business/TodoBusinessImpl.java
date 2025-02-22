package org.example.business;

import org.example.data.TodoService;

import java.util.ArrayList;
import java.util.List;

public class TodoBusinessImpl {
    private TodoService todoService;

    public TodoBusinessImpl(TodoService todoService) {
        this.todoService = todoService;
    }

    public List<String> retrieveTodosRelatedToSpring(String user)
    {
        List<String> filteredTodos = new ArrayList<>();
        List<String> allTodos =todoService.retrieveTodos(user);
        for(String todo :allTodos)
        {
            if(todo.contains("Spring"))
            {
                filteredTodos.add(todo);
            }
        }
        return filteredTodos;
    }
}
