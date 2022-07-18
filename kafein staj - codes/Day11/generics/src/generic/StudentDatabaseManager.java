package generic;

import java.util.ArrayList;

public class StudentDatabaseManager implements IDatabaseManager<Student>{
    @Override
    public void add(Student item) {
        //Database codes
        System.out.println("Added to the database.");
    }
    @Override
    public void remove(Student item) {
        //Database codes
        System.out.println("Removed from the database.");
    }
    @Override
    public void update(Student item) {
        //Database codes
        System.out.println("Added to the database.");
    }
    @Override
    public Student get(int id) {
        //Database codes
        ArrayList<String> testCourses = new ArrayList<String>();
        testCourses.add("Calculus");
        return new Student("Example Student", id, testCourses);
    }
}
