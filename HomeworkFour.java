import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeworkFour {

    public static final int SIZE = 3;
    public static final char[][] BOARD = new char[SIZE][SIZE];
    public static final char DOT_EMPTY = '.';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';

    public static final Scanner SCANNER = new Scanner(System.in);
    public static final Random RANDOM = new Random();

    public static void init() {
        for (char[] chars : BOARD) {
            Arrays.fill(chars, DOT_EMPTY);
        }

        
        /*
        for (int i = 0; i < BOARD.length; i++) {
            for (int j = 0; j < BOARD[i].length; j++) {
                BOARD[i][j] = DOT_EMPTY;
            }
        }
        */
    }

    public static void printBoard() {
        for (int i = 0; i <= 3; i++) {
            System.out.print(i + " ");
        }
        System.out.println();


        for (int i = 0; i < BOARD.length; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < BOARD[i].length; j++) {
                System.out.print(BOARD[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static void playerTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты: ");
            x = SCANNER.nextInt() - 1;
            y = SCANNER.nextInt() - 1;
        } while (!isValid(x, y));
        BOARD[x][y] = DOT_X;
    }

    public static void aiTurn() {
        int x, y;
        do {
            x = RANDOM.nextInt(SIZE);
            y = RANDOM.nextInt(SIZE);
        } while (!isValid(x, y));
        BOARD[x][y] = DOT_O;
    }

    public static boolean isValid(int x, int y) {
        if (x > SIZE || x < 0 || y > SIZE || y < 0) {
            return false;
        }
        if (BOARD[x][y] == DOT_EMPTY) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkWin(char dot) {
        for (int i = 0; i < 3; i++) {
            if ((BOARD[i][0] == dot && BOARD[i][1] == dot && BOARD[i][2] == dot) || (BOARD[0][i] == dot && BOARD[1][i] == dot && BOARD[2][i] == dot))
                return true;
            if ((BOARD[0][0] == dot && BOARD[1][1] == dot && BOARD[2][2] == dot) || (BOARD[2][0] == dot && BOARD[1][1] == dot && BOARD[0][2] == dot))
                return true;
        }
        return false;
    }



        /*
        if (BOARD[0][0] == c && BOARD[0][1] == c && BOARD[0][2] == c) return true;
        if (BOARD[1][0] == c && BOARD[1][1] == c && BOARD[1][2] == c) return true;
        if (BOARD[2][0] == c && BOARD[2][1] == c && BOARD[2][2] == c) return true;
        if (BOARD[0][0] == c && BOARD[1][0] == c && BOARD[2][0] == c) return true;
        if (BOARD[0][1] == c && BOARD[1][1] == c && BOARD[2][1] == c) return true;
        if (BOARD[0][2] == c && BOARD[1][2] == c && BOARD[2][2] == c) return true;
        if (BOARD[0][0] == c && BOARD[1][1] == c && BOARD[2][2] == c) return true;
        if (BOARD[2][0] == c && BOARD[1][1] == c && BOARD[0][2] == c) return true;
        return false;

         */


    public static boolean checkDraw() {
        for (int i = 0; i < BOARD.length; i++) {
            for (int j = 0; j < BOARD[i].length; j++) {
                if (BOARD[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        init();
        printBoard();
        while (true) {
            playerTurn();
            printBoard();
            if (checkWin(DOT_X)) {
                System.out.println("Победа игрока!");
                break;
            }
            if (checkDraw()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printBoard();
            if (checkWin(DOT_O)) {
                System.out.println("Победа компьютера!");
                break;
            }
            if (checkDraw()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Game over");
    }
}
