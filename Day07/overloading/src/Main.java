public class Main {
    public static int example(int a, int b){
        return a + b;
    }
    public static int example(int a, int b, int c){
        return a + b - c;
    }
    public static int example(int a, int b, int c, int d){
        return a * b + c - d;
    }
    public static void main(String[] args) {
        System.out.println(example(5, 4));
        System.out.println(example(5,4,3));
        System.out.println(example(5,4,3,2));
    }
}
