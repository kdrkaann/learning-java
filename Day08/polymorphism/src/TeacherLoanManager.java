public class TeacherLoanManager extends BaseLoanManager{
    @Override
    public double calculate(double amount) {
        return amount * 1.13;
    }
}
