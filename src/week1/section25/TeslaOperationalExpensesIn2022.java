package week1.section25;

public class TeslaOperationalExpensesIn2022 {
    public static void main(String[] args) {
        long totalYearlyExpenses = 67806000000L;
        short daysInYear = 365;
        long dailyCashBurnRate = totalYearlyExpenses/daysInYear;

        System.out.println(dailyCashBurnRate);
    }
}
