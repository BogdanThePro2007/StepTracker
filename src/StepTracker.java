import java.util.Scanner;

public class StepTracker {

    private final MonthData monthData = new MonthData();
    private Scanner scanner = new Scanner(System.in);

    public int setNewStepGoal() {
        int newStepGoal = scanner.nextInt();
        return monthData.setStepGoal(newStepGoal);
    }

    public int addSteps() {
        int steps = scanner.nextInt();
        int day = scanner.nextInt();
        return monthData.addNewData(steps, day);
    }
}
