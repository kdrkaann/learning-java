import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] arr = {1.7, 2.6, 9.3, 2.4, 8.4, 3.5};
        System.out.println(Arrays.toString(arr));
        double max = 0;
        double total = 0;
        for(double n : arr){
            if(max < n){
                max = n;
            }
            total += n;
        }
        System.out.println("Total: " + total);
        System.out.println("Max: " + max);
    }
}