package org.example.model;
import org.example.service.TodoService;

import java.util.ArrayList;
import java.util.List;

public class TodoServiceImpl implements TodoService {
    public List<Todo> todos= new ArrayList<>();

    public List<String> getAll() {
        List<String> taskNames= new ArrayList<>();
        for (int i = 0; i <this.todos.size(); i++){
            taskNames.add(i+") "+this.todos.get(i).getName());
        }
        return taskNames;
    }

    public Todo getById(int id) {
        for (Todo t : todos) {
            if (t.getId() == id) {
                return t;
            }
        }
        return null;
    }

    public void add(String name, String description) {
        Todo todo = new Todo(name, description);
        this.todos.add(todo);

    }

    public void update(int id, String name, String description, boolean done) {
        Todo todo = new Todo(name, description);
        for (Todo t : todos) {
            if (t.getId() == id) {
                todos.get(t.getId()).setName(name);
                todos.get(t.getId()).setDescription(description);
                todo.setDone(done);
            }
        }
    }

    public void remove(int id) {
//        Todo todo = new Todo(id);
//        for (Todo t : todos) {
//        }
//        if (t.getId() == id) {
//            remove(id);
//        }
    }

    public void toggleDone(int id) {

    }

}
