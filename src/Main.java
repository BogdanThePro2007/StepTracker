import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // git add "название файла который мы изменилиЭ
        // git commit -m "сообщение которое опиывает наше изменение"
        // git push - комманда отправки на github
        Scanner scanner = new Scanner(System.in);
        StepTracker stepTracker = new StepTracker();

        while (true) {
            printMenu();
            int inputCommand = scanner.nextInt();

            switch (inputCommand) {
                case 1:
                    System.out.println("Введите количество шагов, затем введите день.");
                    System.out.println("В этот день вы прошли: " + stepTracker.addSteps());
                case 2:
                    System.out.println("Введите новую цель.");
                    System.out.println("Ваша новая цель - " + stepTracker.setNewStepGoal() + " шагов.");
                case 3:
                case 4:
                case 0:
                default:
                    System.out.println("Введите число от 1 до 5.");

            }

        }

    }

    public static void printMenu() {
                System.out.println("1 - Ввести пройденные шаги за день");
                System.out.println("2 - Ввести ежедневную цель по шагам");
                System.out.println("3 - Статистика шагов за месяц");
                System.out.println("4 - Мои рекорды");
                System.out.println("0 - Выход");
    }
}