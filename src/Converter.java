public class Converter {

    public double calcCalories(int steps) {    // Калькулятор калорий
        double cal = steps * 0.05;
        return cal;
    }

    public double calcMetres(int steps) {    // Калькулятор метров
        double metres = steps * 0.7;
        return metres;
    }

    public double[][] calcDailyKilocalsAndMetres(int[] steps) {
        int n = 2;
        int m = 30;
        double[][] kcalsAndMetres = new double[n][m];
        for (int a = 0; a < m; a++) {
            kcalsAndMetres[0][a] = steps[a] * 0.05;
            kcalsAndMetres[1][a] = steps[a] * 0.7;
        }
        return kcalsAndMetres;
    }

    public double calcMonthMeters(double steps) {    // Сумма  за весь месяц
        return steps * 0.7;
    }

    public double calcMonthCals(double steps) {    // Сумма  за весь месяц
        return steps * 0.05;
    }
}
