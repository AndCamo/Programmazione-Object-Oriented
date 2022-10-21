import java.util.Random;
import java.util.Scanner;

public class Dice {

    public static void main(String[] args) {
        BankAccount playerAccount = new BankAccount(1000);
        BankAccount casinoAccount = new BankAccount(100000);
        int predictedValue, actualValue;
        double bet;

        String choice = "no";
        Scanner in = new Scanner(System.in);
        Random generatore = new Random();

        do{
            do {
                System.out.println("Prova ad indovinare il valore del dado:");
                predictedValue = in.nextInt();
                in.nextLine();
                if(predictedValue < 1 || predictedValue > 6) {
                    System.out.println("IL valore non è valido.");
                }
                else
                    break;
            } while (true);

            System.out.println("Piazza la tua scommessa");
            bet = in.nextInt();
            in.nextLine();

            //CONTROLLO DELLA BET
            if(bet > casinoAccount.getBalance() / 5 && bet <= playerAccount.getBalance()) {
                bet = casinoAccount.getBalance() / 5;
                System.out.println("La puntata è troppo alta!\nLa tua bet è impostata a: " + bet);
            }else
            if(bet > playerAccount.getBalance()) {
                bet = playerAccount.getBalance();
                System.out.println("Non hai abbastanza soldi!\nLa tua bet è impostata a: " + bet);
            }
            playerAccount.withdraw(bet);

            actualValue = generatore.nextInt(6) + 1;

            System.out.println("Risultato del dado: " + actualValue);
            if(actualValue == predictedValue)
            {
                double win = (bet * 5);
                playerAccount.deposit(win);
                casinoAccount.withdraw(win);
                System.out.println("COMPLIMENTI! Hai vinto " + win);
            }
            else
            {
                casinoAccount.deposit(bet);
                System.out.println("HAI PERSO!");
            }

            System.out.println("SALDO GIOCATORE: " + playerAccount.getBalance());
            System.out.println("SALDO CASINO: " + casinoAccount.getBalance());

            if(playerAccount.getBalance() <= 0)
            {
                System.out.println("Hai finito i soldi!");
                choice = "no";
            }
            else
            {
                System.out.println("Vuoi rigiocare?");
                choice = in.nextLine();
            }
        }while (choice.compareTo("si") == 0);

        System.out.println("Il tuo saldo è " + playerAccount.getBalance());

    }
}