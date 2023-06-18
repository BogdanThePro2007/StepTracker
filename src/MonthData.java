public class MonthData {

    private int stepAmount = 12340;
    private int stepGoal;
    private int[] stepMonthData = new int[30];

    public int getStepAmount() {
        return stepAmount;
    }

    public void setStepAmount(int stepAmount) {
        this.stepAmount = stepAmount;
    }

    public int getStepGoal() {
        return stepGoal;
    }

    public int setStepGoal(int stepGoal) {
        return this.stepGoal = stepGoal;
    }

    public int addNewData(int steps, int day) {
        return stepMonthData[day] += steps;
    }

    public int[] getStepMonthData() {
        return stepMonthData;
    }
}
