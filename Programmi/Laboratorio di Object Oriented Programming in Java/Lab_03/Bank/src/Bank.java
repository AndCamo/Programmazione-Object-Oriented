import java.lang.invoke.LambdaMetafactory;
import java.util.ArrayList;
import java.util.List;

public class Bank {

    private final List<BankAccount> accounts;

    public Bank() {
        this.accounts = new ArrayList<>();
    }

    public void addAccount(double initialBalance, String customerName) {
        accounts.add(new BankAccount(initialBalance, customerName));
    }

    public BankAccount find(int accountNumber) {
        for (BankAccount ba : this.accounts) {
            if (ba.getAccountNumber() == accountNumber)
                return ba;
        }
        return null;
    }

    public void deposit(int accountNumber, double amount) {
        BankAccount currentAccount = find(accountNumber);
        currentAccount.deposit(amount);
    }

    public void withdraw(int accountNumber, double amount) {
        BankAccount currentAccount = this.find(accountNumber);
        currentAccount.withdraw(amount);
    }

    public double getBalance(int accountNumber) {
        BankAccount currentAccount = this.find(accountNumber);
        return currentAccount.getBalance();
    }

    public void transfer(int fromAccountNumber, int toAccountNumber, double amount) {
        BankAccount senderAccount = find(fromAccountNumber);
        BankAccount reciverAccount = find(toAccountNumber);
        senderAccount.withdraw(amount);
        reciverAccount.deposit(amount);
    }
}