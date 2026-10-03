package week1.section26;

public class CalculatingTheRemainingBatteryLife {
    public static void main(String[] args) {
        int originalBatteryCapacity = 100;
        int batterySpent = 85;
        int remainingUnits = originalBatteryCapacity - batterySpent;

        int remainingBatteryLife = (remainingUnits * 100) / originalBatteryCapacity;
        System.out.println("The remaining battery life is: " + remainingBatteryLife + "%");

    }
}
