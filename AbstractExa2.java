package comPack.labWork27_4;

abstract class BankAccount{
    private int accountNo;
    private double balance;
    
    public BankAccount(int accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }
    public int getAccountNo() {
        return accountNo;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    abstract public void withdraw(double bal);
    abstract public void deposit(double bal);
}

class CheckingAccount extends BankAccount{    

    public CheckingAccount(int accountNo, double balance) {
        super(accountNo, balance);
        System.out.println(" --- Bank Account No. ="+getAccountNo()+" ,\t Current balance = "+getBalance()+" --- ");
    }

    @Override
    public void withdraw(double bal) {
        if(getBalance() < bal)
            System.out.println(" Not Sufficent Balance ");
        else{
            setBalance(getBalance()-bal);
            System.out.println(bal+" Withdraw Succes, Current Balance = $"+getBalance());
        }
    }

    @Override
    public void deposit(double bal) {
        setBalance(getBalance()+bal);
        System.out.println(bal+" Deposit Succes, Current Balance = $"+getBalance());
    }

}

public class AbstractExa2 {
    public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount(1000101, 100000);
        checkingAccount.deposit(500);
        checkingAccount.deposit(500);
        checkingAccount.withdraw(1000);

    }
    
}
