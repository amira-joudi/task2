import java.util.Scanner;

public class NumberRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter the second number:");
        int secondNumber = scanner.nextInt();

        scanner.close();

        if (firstNumber < secondNumber) {
<<<<<<< HEAD
            System.out.println("Odd numbers between " + firstNumber + " and " + secondNumber + ":");
            for (int i = firstNumber + 1; i < secondNumber; i++) {
                if (i % 2 != 0) {
=======
            for (int i = firstNumber + 1; i < secondNumber; i++) {
                if (i % 2 == 0) {
>>>>>>> feature-3
                    System.out.print(i + " ");
                }
            }
        } else {
<<<<<<< HEAD
            System.out.println("Odd numbers between " + secondNumber + " and " + firstNumber + ":");
            for (int i = secondNumber + 1; i < firstNumber; i++) {
                if (i % 2 != 0) {
=======
            for (int i = secondNumber + 1; i < firstNumber; i++) {
                if (i % 2 == 0) {
>>>>>>> feature-3
                    System.out.print(i + " ");
                }
            }
        }
    }
}
