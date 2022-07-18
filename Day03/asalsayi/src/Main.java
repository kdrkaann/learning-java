import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Write a number to check: ");
        int num = input.nextInt();

        if(num == 1){
            System.out.println("It is not a prime number.");
            return;
        }
        else if(num <= 0){
            System.out.println("Invalid number.");
            return;
        }
        boolean isPrime = true;
        for(int i = 2; i < num; i++){
            if(num % i == 0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.println("It is a prime number.");
        }
        else{
            System.out.println("It is not a prime number.");
        }
    }
}