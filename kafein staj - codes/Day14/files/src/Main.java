import java.io.File;

public class Main {
    public static void main(String[] args) {
        FileManager manager = new FileManager();
        String filePath = "C:\\Users\\Kadir Kaan\\IdeaProjects\\files\\students.txt";
        File file = manager.createFile(filePath);
        manager.getFileInfo(file);
        System.out.println("----------");
        manager.writeFile(file, "Kadir Kaan");
        manager.writeFile(file, "Batuhan");
        manager.writeFile(file, "Eren");
        manager.readFile(file);
        System.out.println("File size (byte):" + file.length());
    }
}
