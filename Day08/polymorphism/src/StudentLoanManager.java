public class StudentLoanManager extends BaseLoanManager{
    @Override
    public double calculate(double amount){
        return amount * 1.10;
    }
}
