import java.util.Scanner;

public class TicTacToe {

    private final String[][] board;
    static int ROWS = 3;
    static int COLUMNS = 3;
    static String player1 = "x";
    static String player2 = "o";

    public TicTacToe() {
        board = new String[ROWS][COLUMNS];
        for (int i = 0; i < ROWS; i++)
            for (int j = 0; j < COLUMNS; j++)
                board[i][j] = " ";
    }

    public String toString() {
        StringBuilder r = new StringBuilder();
        for (int i = 0; i < ROWS; i++) {
            r.append("|");
            for (int j = 0; j < COLUMNS; j++)
                r.append(board[i][j]);
            r.append("|\n");
        }
        return r.toString();
    }

    public void set(int i, int j, String player) {
        if (board[i][j].equals(" "))
            board[i][j] = player;
    }

    public String getWinner() {
        int i = 0, j = 0;
        boolean columnFlag, rowFlag, diagonalFlag;
        String winner = " ";
        String currentPlayer = " ";

        //ROW AND COLUMN CHECK WINNER
        for (i = 0; i < ROWS; i++)
        {
            rowFlag = true;
            columnFlag = true;
            for(j = 0; j < COLUMNS; j++)
            {
                if(!(board[i][j].equals(board[i][0])) || (board[i][0].equals(" ")))
                    rowFlag = false;
                if(!(board[j][i].equals(board[0][i])) || (board[0][i].equals(" ")))
                    columnFlag = false;
            }
            if(rowFlag) {
                currentPlayer = board[i][0];
                winner = currentPlayer;
                return winner;
            }
            else if(columnFlag){
                currentPlayer = board[0][i];
                winner = currentPlayer;
                return winner;
            }
        }
        //CHECK FIRST DIAGONAL
        diagonalFlag = true;
        for (i = 0; i < ROWS; i++)
        {
            if(!(board[i][i].equals(board[0][0])) || (board[0][0].equals(" ")))
                diagonalFlag = false;
        }
        if(diagonalFlag) {
            currentPlayer = board[0][0];
            winner = currentPlayer;
            return winner;
        }

        //CHECK SECOND DIAGONAL
        diagonalFlag = true;
        j = COLUMNS - 1;
        for (i = 0; i < ROWS; i++)
        {
            if(!(board[i][j].equals(board[0][COLUMNS - 1])) || (board[0][COLUMNS - 1].equals(" ")))
                diagonalFlag = false;
            j--;
        }
        if(diagonalFlag) {
            currentPlayer = board[0][COLUMNS - 1];
            winner = currentPlayer;
            return winner;
        }

        return "Nessun vincitore";
    }

    public static void main(String[] args) {
        String player = player1;
        TicTacToe game = new TicTacToe();
        Scanner in = new Scanner(System.in);
        int row, column;
        System.out.println(game);

        do {
            if (game.getWinner().equals(player1) || game.getWinner().equals(player2)) {
                System.out.println("Partita finita");
                System.out.println("Vince: " + game.getWinner());
                System.exit(0);
            }

            System.out.println("Inserisci riga per " + player + " (-1 per uscire):");
            row = in.nextInt();

            if (row == -1) {
                System.out.println("Partita finita");
                System.exit(0);
            }

            System.out.println("Inserisci colonna per " + player + ":");
            column = in.nextInt();

            if (row >= ROWS || column >= COLUMNS) {
                System.out.println("Combinazione non valida");
            } else {
                game.set(row, column, player);

                System.out.println(game);

                System.out.println("Vince: " + game.getWinner());

                if (player.equals(player1))
                    player = player2;
                else
                    player = player1;
            }

        } while (row < ROWS && column < COLUMNS);
    }
}