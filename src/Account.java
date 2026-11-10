public class Account {
    public double balance;

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public void withdraw(double amount) {
        balance = balance - amount;
    }

    public static void main(String[] args) {
        Account a = new Account();
        a.deposit(100.10);
        a.withdraw(200);
        System.out.println(a.balance);
    }
}
