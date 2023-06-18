import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // git add "название файла который мы изменили"
        // git commit -m "сообщение которое опиывает наше изменение"
        // git push - комманда отправки на github

        Scanner scanner = new Scanner(System.in);
        StepTracker stepTracker = new StepTracker();



        while (true) {
            stepTracker.getSumStatistics();
            printMenu();
            int inputCommand = scanner.nextInt();

            switch (inputCommand) {
                case 1:
                    System.out.println("Введите количество шагов, затем введите день.");
                    System.out.println("В этот день вы прошли: " + stepTracker.addSteps());
                    break;

                case 2:
                    System.out.println("Введите новую цель.");
                    System.out.println("Ваша новая цель - " + stepTracker.setNewStepGoal() + " шагов.");
                    break;

                case 3:
                    System.out.println("Ваша статистика за месяц:");
                    stepTracker.getMonthStatistic();
                    break;

                case 4:
                    int[] records = stepTracker.printMonthRecords();
                    System.out.println("Ваш рекорд: " + records[1] + " шагов за " +
                            records[0] + " день.");

                case 0:
                    break;
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