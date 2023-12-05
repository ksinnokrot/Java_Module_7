import java.util.Scanner;

public class ArrayAverage {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter ten double values
        double[] doubleArray = new double[10];
        System.out.print("Enter ten double values: ");
        
        for (int i = 0; i < 10; i++) {
            doubleArray[i] = input.nextDouble();
        }

        // Calculate and display the average using the overloaded methods
        int intAverage = average(toIntArray(doubleArray));
        double doubleAverage = average(doubleArray);

        System.out.println("Average of integers: " + intAverage);
        System.out.println("Average of doubles: " + doubleAverage);
    }

    public static int average(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    public static double average(double[] array) {
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    // Helper method to convert double array to int array
    public static int[] toIntArray(double[] doubleArray) {
        int[] intArray = new int[doubleArray.length];
        for (int i = 0; i < doubleArray.length; i++) {
            intArray[i] = (int) doubleArray[i];
        }
        return intArray;
    }
}
