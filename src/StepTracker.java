import java.util.Scanner;

public class StepTracker {

    private final MonthData monthData = new MonthData();
    private Scanner scanner = new Scanner(System.in);
    private final Converter converter = new Converter();

    public int setNewStepGoal() {
        int newStepGoal = scanner.nextInt();
        return monthData.setStepGoal(newStepGoal);
    }

    public int addSteps() {
        int steps = scanner.nextInt();
        int day = scanner.nextInt();
        monthData.setStepAmount(monthData.getStepAmount() + steps);
        return monthData.addNewData(steps, day - 1);
    }

    public void getMonthStatistic() {
        double[][] statistic = converter.calcDailyKilocalsAndMetres(monthData.getStepMonthData());
        for (int i = 0; i < statistic[1].length; i++) {
            System.out.printf("За %d день вы прошли %.1f метров и потратили %.1f Ккалорий.\n", (i + 1),
                                                                                         statistic[1][i],
                                                                                         statistic[0][i]);
        }
        int steps = calcSumMonthSteps(monthData.getStepMonthData());
        double sumMetres = converter.calcMonthMeters(steps);
        double sumCals = converter.calcMonthCals(steps);
        System.out.printf("Всего пройдено за мемяц %.1f метров\nВсего потрачено за месяц %.1f килокалорий\n", sumMetres, sumCals);
    }
    public void getSumStatistics() {
        double metres = converter.calcMetres(monthData.getStepAmount());
        double cals = converter.calcCalories(monthData.getStepAmount());
        System.out.printf("\nСуммарно пройдено метров: %.1f \nСуммарно сожжено килокалорий: %.1f\n", metres, cals);
    }

    public int[] printMonthRecords() {
        int maxStepsInDay = monthData.getStepMonthData()[0];
        int maxStepsDayIndex = 0;

        for (int i = 1; i < monthData.getStepMonthData().length; i++) {
            if (maxStepsInDay < monthData.getStepMonthData()[i]) {
                maxStepsInDay = monthData.getStepMonthData()[i];
                maxStepsDayIndex = i + 1;
            }
        }

        int[] records = {maxStepsDayIndex, maxStepsInDay};
        return records;
    }

    public int calcSumMonthSteps(int[] steps) {    // Сумма шагов за весь месяц
        int sum = 0;
        for (int i = 0; i < steps.length; i++) {
            sum += steps[i];
        }
        return sum;
    }
}
