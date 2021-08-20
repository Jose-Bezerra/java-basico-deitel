package examples.ch06.fig06_03;

import java.util.Locale;
import java.util.Scanner;

public class MaximumFinder {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three floating-point values " +
                "separated by spaces: ");

        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();

        double result = maximum(number1, number2, number3);
        double resultRefactored = maximumRefactored(number1, number2, number3);

        System.out.println("Maximum is: " + result);
        System.out.println("Maximum Refactored is: " + resultRefactored);
    }

    private static double maximumRefactored(double number1, double number2, double number3) {
        return Math.max(number1, Math.max(number2, number3));
    }

    private static double maximum(double x, double y, double z) {

        double maximumValue = x;

        if (y > maximumValue) {
            maximumValue = y;
        }

        if (z > maximumValue) {
            maximumValue = z;
        }

        return maximumValue;

    }

}
