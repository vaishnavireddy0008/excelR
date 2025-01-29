import java.util.Scanner;

public class PS002 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Prompt user for input
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            // Calculate the rounded up value to the nearest hundred
            int roundedNumber = ((number + 99) / 100) * 100;

            // Output the result
            System.out.println("Rounded up to the nearest hundred: " + roundedNumber);
        }
    }
}