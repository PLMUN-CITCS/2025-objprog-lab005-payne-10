import java.util.Random;

public class MathLibraryDemo {
    public static void main(String[] args) {
        // Power of 2 raised to 3
        double power = Math.pow(2, 3);

        // Square root of 16
        double squareRoot = Math.sqrt(16);

        // Rounding a decimal number
        double numberToRound = 5.7;
        int roundedNumber = (int) Math.round(numberToRound);

        // Generating a random number between 0.0 and 1.0
        double randomNumber = Math.random();

        // Displaying the output
        System.out.println("Power: " + power);
        System.out.println("Square Root: " + squareRoot);
        System.out.println("Rounded Number: " + roundedNumber);
        System.out.println("Random Number: " + randomNumber);
    }
}
