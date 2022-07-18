import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sesli harf giriniz: ");
        String str = input.nextLine();

        str = str.toLowerCase();
        if(str.equals("a") || str.equals("ı") || str.equals("o") || str.equals("u")){
            System.out.println("Kalın sesli harf.");
        }
        else if(str.equals("e") || str.equals("i") || str.equals("ö") || str.equals("ü")){
            System.out.println("İnce sesli harf.");
        }
        else{
            System.out.println("Sesli harf girmediniz!");
        }
    }
}