import java.io.*;
import java.util.Scanner;

public class FileManager {

    public File createFile(String filePath){
        File file = new File(filePath);
        try {
            if(file.createNewFile()){
                System.out.println("File created.");
            }
            else{
                System.out.println("File already exists.");
            }
        } catch (IOException exception){
            throw new RuntimeException(exception);
        }
        return file;
    }

    public void getFileInfo(File file){
        System.out.println("File name: " + file.getName());
        System.out.println("File path: " + file.getAbsolutePath());
        System.out.println("Is it readable: " + file.canRead());
        System.out.println("Is it writable: " + file.canWrite());
        System.out.println("File size (byte): " + file.length());
    }

    public void readFile(File file){
        try {
            Scanner reader = new Scanner(file);
            while(reader.hasNext()){
                String line = reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException exception) {
            throw new RuntimeException(exception);
        }
    }

    public void writeFile(File file, String stringToWrite){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
            writer.write(stringToWrite);
            writer.newLine();
            writer.close();
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
    }
}
