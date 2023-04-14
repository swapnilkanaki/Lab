package comPack.labWork13_4;

public interface BankAccount {
    void deposit(double amount);
    void withdraw(double amount);
}

public class CheckingAccount implements BankAccount {
    private double balance;

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            throw new IllegalArgumentException("Insufficient balance");
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class Q3 {
    public static void main(String[] args) {
        CheckingAccount account = new CheckingAccount();

        account.deposit(1000.0);
        account.withdraw(500.0);

        System.out.println("Current balance: " + account.getBalance());
    }
}
