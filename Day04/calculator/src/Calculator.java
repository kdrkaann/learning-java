import static java.lang.Math.*;

public class Calculator {
    public int sum(int... nums){
        int result = 0;
        for(int num : nums){
            result += num;
        }
        return result;
    }
    public int subtract(int... nums){
        int result = 0;
        for(int num : nums){
            result -= num;
        }
        return result;
    }
    public int multiply(int... nums){
        int result = 1;
        for(int num : nums){
            result *= num;
        }
        return result;
    }
    public double divide(double num1, double num2){
        return num1/num2;
    }
    public int remainder(int num1, int num2){
        return num1%num2;
    }
    public int square(int num){
        return num*num;
    }
    public double squareRoot(int num){
        return sqrt(num);
    }
}
