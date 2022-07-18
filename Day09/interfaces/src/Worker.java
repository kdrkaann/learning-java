public class Worker implements IWorkable, IPayable, IEatable, IRewardable{
    @Override
    public void work() {
        //works for us
    }
    @Override
    public void workingHours() {
        System.out.println("Works 9am to 6pm");
    }
    @Override
    public void pay() {
        //we pay their salary
    }
    @Override
    public void eat() {
        //we pay for their food expenses
    }
    @Override
    public void reward() {
        //we give them rewards
    }
}
