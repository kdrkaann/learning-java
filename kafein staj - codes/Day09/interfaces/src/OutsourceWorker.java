public class OutsourceWorker implements IWorkable, IEatable {
    @Override
    public void work() {
        //works for us by outsourcing
    }
    @Override
    public void workingHours() {
        System.out.println("Works 10am to 5pm");
    }
    @Override
    public void eat() {
        //we pay for their food expenses
    }
}
