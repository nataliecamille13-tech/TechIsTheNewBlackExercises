package week1.section32;

public class HowManyBricks {
    public static void main(String[] args) {
        int wallLength = 300; // in cm
        int wallHeight = 200; // in cm

        int brickLength = 20; // in cm
        int brickHeight = 10; // in cm

        int wallArea = wallLength * wallHeight;

        int brickArea = brickLength * brickHeight;

        int numberOfBricks = wallArea / brickArea;

        System.out.printf("The number of bricks needed to build the wall is: %d", numberOfBricks);


    }
}
