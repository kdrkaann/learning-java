package generic;

import java.util.ArrayList;

public class Student {
    private String name;
    private int id;
    ArrayList<String> courses;

    public Student(String name, int id, ArrayList<String> courses){
        this.name = name;
        this.id = id;
        this.courses = courses;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
