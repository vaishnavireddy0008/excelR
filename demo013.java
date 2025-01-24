import java.util.Scanner;

public class demo013 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the base of the triangle
        System.out.print("Enter the base of the triangle: ");
        double base = scanner.nextDouble();

        // Prompt the user to enter the height of the triangle
        System.out.print("Enter the height of the triangle: ");
        double height = scanner.nextDouble();

        // Calculate the area of the triangle
        double area = 0.5 * base * height;

        // Display the result
        System.out.printf("The area of the triangle with base %.2f and height %.2f is: %.2f%n", base, height, area);

        // Close the scanner
        scanner.close();
    }
}