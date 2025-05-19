package org.example;


import org.example.ihm.Ihm;
import org.example.model.TodoServiceImpl;
import org.example.service.TodoService;


public class Main {
    public static void main(String[] args) {
        TodoService service = new TodoServiceImpl();
        Ihm ihm = new Ihm(service);
        ihm.start();
    }
}