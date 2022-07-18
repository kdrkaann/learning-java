import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> hashTable = new HashMap<>();
        hashTable.put("İstanbul", 34);
        hashTable.put("Trabzon", 61);
        hashTable.put("Sinop", 57);

        for(String n : hashTable.keySet()){
            System.out.println(hashTable.get(n));
        }
        System.out.println("------");
        System.out.println(hashTable.get("Trabzon"));

        hashTable.remove("Trabzon");
        System.out.println(hashTable);
    }
}
