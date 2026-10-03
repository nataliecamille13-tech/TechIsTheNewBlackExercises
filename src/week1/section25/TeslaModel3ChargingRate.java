package week1.section25;

public class TeslaModel3ChargingRate {
    public static void main(String[] args) {
        short currentKwh = 35;
        short fullKwh = 50;
        short ratePerHour = 5;
        int remainingCharge = fullKwh-currentKwh;
        int remainingChargingTime = remainingCharge/ratePerHour;

        System.out.println(remainingChargingTime);
    }
}
