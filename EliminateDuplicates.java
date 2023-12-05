import java.util.Scanner;

public class EliminateDuplicates {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter ten numbers
        System.out.print("Enter ten numbers: ");
        int[] numbers = new int[10];

        for (int i = 0; i < 10; i++) {
            numbers[i] = input.nextInt();
        }

        // Eliminate duplicates and get the distinct numbers
        int[] distinctNumbers = eliminateDuplicates(numbers);

        // Display the distinct numbers
        System.out.print("The distinct numbers are: ");
        for (int number : distinctNumbers) {
            System.out.print(number + " ");
        }
    }

    public static int[] eliminateDuplicates(int[] list) {
        int[] distinctList = new int[list.length];
        int distinctCount = 0;

        for (int i = 0; i < list.length; i++) {
            boolean isDistinct = true;
            for (int j = 0; j < i; j++) {
                if (list[i] == list[j]) {
                    isDistinct = false;
                    break;
                }
            }
            if (isDistinct) {
                distinctList[distinctCount] = list[i];
                distinctCount++;
            }
        }

        int[] result = new int[distinctCount];
        System.arraycopy(distinctList, 0, result, 0, distinctCount);

        return result;
    }
}
