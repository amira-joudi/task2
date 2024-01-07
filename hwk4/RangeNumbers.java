import java.util.Scanner;

public class RangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int secondNumber = scanner.nextInt();

        // Ensure the first number is smaller than the second number
        if (firstNumber >= secondNumber) {
            System.out.println("Please enter valid numbers with the first number smaller than the second number.");
            return;
        }

        System.out.println("Numbers between " + firstNumber + " and " + secondNumber + ":");
        for (int i = firstNumber + 1; i < secondNumber; i++) {
            System.out.println(i);
        }
    }
}
