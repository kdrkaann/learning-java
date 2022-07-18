public class Main {
    public static void main(String[] args) {
        BaseLoanManager[] loans = new BaseLoanManager[] {new AgricultureLoanManager(), new StudentLoanManager(), new TeacherLoanManager()};
        for (BaseLoanManager loan : loans){
            System.out.println("Total amount of pay back: " + loan.calculate(15000));
        }
    }
}
