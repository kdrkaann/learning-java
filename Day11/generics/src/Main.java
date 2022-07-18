import generic.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> courses = new ArrayList<String>();
        courses.add("Data Structures & Algorithms");
        courses.add("Microprocessors");
        Student KadirKaan = new Student("Kadir Kaan", 201701038, courses);

        System.out.println(KadirKaan.getName());
        System.out.println(KadirKaan.getId());

        StudentDatabaseManager manager = new StudentDatabaseManager();
        manager.add(KadirKaan);

        Validator.validate(KadirKaan);
    }
}
