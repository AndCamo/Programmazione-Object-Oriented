import java.util.Scanner;

public class InputChecker {

    public String checkInput(String input) {
        if(input.equals("S") || input.equals("SI") || input.equals("OK") || input.equals("certo") || input.equals("perche no?")) {
            return ("OK");
        }
        else if(input.equals("N") || input.equals("No")) {
            return ("Fine");
        }
        else {
            return ("Dato non corretto");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Dammi l'input di verifica: ");
        String input = in.nextLine();

        InputChecker inputChecker = new InputChecker();
        System.out.println(inputChecker.checkInput(input));
    }
}