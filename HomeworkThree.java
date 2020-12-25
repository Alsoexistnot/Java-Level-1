import java.util.Scanner;

public class HomeworkThree {


    public static void main(String[] args) {
        int oneMoreGame;
        Scanner scanner = new Scanner(System.in);
        Game();
        System.out.println("Хотите сыграть ещё раз?\n1 - да, 0 - нет:");
        oneMoreGame = scanner.nextInt();
        switch (oneMoreGame) {
            case 1:
                System.out.println("Сыграем ещё раз!");
                Game();
            case 0:
                break;
        }

    }

    public static void Game() {

        int numberAnswer = (int) (Math.random() * 10);
        int count;
        int playerAnswer;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Вам необходимо угадать число от 0 до 9. Введите его:");
        //System.out.println(numberAnswer); - проверка ответа


        for (count = 0; count < 3; count++) {
            playerAnswer = scanner.nextInt();

            if (playerAnswer == numberAnswer) {
                System.out.println("Поздравляю, Вы победили!");
                break;
            } else if (playerAnswer > numberAnswer) {
                if (count < 1) {
                    System.out.println("Ваш ответ больше загаданного.");
                    System.out.println("Попробуйте ещё раз: ");
                } else if (count == 1) {
                    System.out.println("Ваш ответ больше загаданного.");
                    System.out.println("Последняя попытка: ");
                } else {
                    System.out.println("Вы проиграли!");
                }
            } else if (playerAnswer < numberAnswer) {
                if (count < 1) {
                    System.out.println("Ваш ответ меньше загаданного.");
                    System.out.println("Попробуйте ещё раз: ");
                } else if (count == 1) {
                    System.out.println("Ваш ответ меньше загаданного.");
                    System.out.println("Последняя попытка: ");
                } else {
                    System.out.println("Вы проиграли!");
                }
            }
        }
    }

}








