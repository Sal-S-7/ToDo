package org.example.model;

public class PriorityTodo extends Todo {
    int basse;
    int moyenne;
    int haute;

    public PriorityTodo(String name, String description) {
        super(name, description);
    }

    public String priority(){
        basse = 0;
        moyenne = 0;
        haute = 0;

        return "";
    }

    @Override
    public String toString() {
        return "--- Liste de priorité---\n" + "\n- Basse : " + basse + "\n- Moyenne : " + moyenne + "\n- Haute : " + haute;
    }
}
