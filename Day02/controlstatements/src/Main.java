public class Main {
    public static void main(String[] args) {
        boolean flag = true;
        if(flag == true){
            System.out.println("Flag is true.");
        }
        else{
            System.out.println("Flag is false.");
        }

        char grade = 'A';
        switch (grade){
            case 'A':
                System.out.println("Well done!");
                break;
            case 'B':
                System.out.println("Great!");
                break;
            case 'C':
                System.out.println("Good!");
                break;
            case 'D':
                System.out.println("Enough.");
                break;
            case 'F':
                System.out.println("You should work harder!");
                break;
        }
    }
}