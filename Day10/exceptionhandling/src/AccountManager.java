public class AccountManager {
    private double balance;

    public void deposit(double amount){
        balance = getBalance() + amount;
    }

    public void withdraw(double amount) throws BalanceInsufficientException{
        if(amount < getBalance()){
           balance = getBalance() - amount;
        }
        else{
            throw new BalanceInsufficientException("Insufficient Balance!");
        }
    }

    public double getBalance() {
        return balance;
    }
}
