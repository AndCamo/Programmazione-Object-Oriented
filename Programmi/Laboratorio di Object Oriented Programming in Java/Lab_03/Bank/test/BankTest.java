import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BankTest {

    @Before
    public void setup(){
        BankAccount.totalNumberOfAccounts = 0;
    }

    @Test
    public void findAccountTest() {
        Bank b = new Bank();
        b.addAccount(1000, "Dario");
        BankAccount newAccount = b.find(1);
        Assert.assertEquals(1, newAccount.getAccountNumber());
        Assert.assertEquals(1000, newAccount.getBalance(), 0);
        Assert.assertEquals("Dario", newAccount.getCustomerName());
    }

    @Test
    public void depositTest() {
        Bank newBank = new Bank();
        newBank.addAccount(10000, "Andrea");
        BankAccount account = newBank.find(1);
        Assert.assertEquals(1, account.getAccountNumber(), 0);
        newBank.deposit(1, 5000);

        Assert.assertEquals(15000, account.getBalance(), 0);

    }

    @Test
    public void withdrawTest() {
        Bank newBank = new Bank();
        newBank.addAccount(10000, "Andrea");
        BankAccount account = newBank.find(1);
        Assert.assertEquals(1, account.getAccountNumber(), 0);
        newBank.withdraw(1, 5000);

        Assert.assertEquals(5000, account.getBalance(), 0);
    }

    @Test
    public void transferTest() {
        Bank newBank = new Bank();
        newBank.addAccount(10000, "Andrea");
        newBank.addAccount(0, "Mario");
        BankAccount senderAccount = newBank.find(1);
        BankAccount reciverAccount = newBank.find(2);

        newBank.transfer(1,2,5000);
        Assert.assertEquals(1, senderAccount.getAccountNumber(), 0);
        Assert.assertEquals(2, reciverAccount.getAccountNumber(), 0);


        Assert.assertEquals(5000, senderAccount.getBalance(), 0);
        Assert.assertEquals(5000, reciverAccount.getBalance(), 0);

    }
}