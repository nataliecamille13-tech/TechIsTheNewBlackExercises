package week1.section24;

public class TeslaRunRange {
    public static void main(String[] args) {
        double myCurrentBatteryLifePercentage = 42;

        double milesPer1Percent = 3.15;

        double totalDistanceRange = myCurrentBatteryLifePercentage * milesPer1Percent;

        System.out.println(totalDistanceRange);
    }
}
