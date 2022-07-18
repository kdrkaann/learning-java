public class Main {
    public static void main(String[] args) {
        AccountManager account = new AccountManager();
        account.deposit(100);
        System.out.println("Balance: " + account.getBalance());
        System.out.println("---------");
        try{
            account.withdraw(120);
        }
        catch(BalanceInsufficientException exception){
            System.out.println(exception.getMessage());
        }
        System.out.println("---------");
        account.deposit(50);
        System.out.println(account.getBalance());
    }
}
