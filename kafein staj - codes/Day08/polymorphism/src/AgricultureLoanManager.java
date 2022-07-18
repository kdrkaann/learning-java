public class AgricultureLoanManager extends BaseLoanManager{
    @Override
    public double calculate(double amount){
        return amount * 1.15;
    }
}
