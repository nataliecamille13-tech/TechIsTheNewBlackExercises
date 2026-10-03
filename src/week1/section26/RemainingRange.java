package week1.section26;

public class RemainingRange {
    public static void main(String[] args) {
        int totalSeconds = 342;
        int minutes = totalSeconds / 60;
        int seconds = totalSeconds % 60;

        System.out.println("Time remaining: " + minutes + " minutes " + seconds + " seconds");

    }
}
