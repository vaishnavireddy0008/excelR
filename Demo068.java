class PrintEvenCount {
    int evenCount(int[] arr) {
        int count = 0;
        // Iterate through the array
        for (int i = 0; i < arr.length; i++) {
            // Check if the element is even
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");  // Print even numbers
                count++;  // Increment count for even numbers
            }
        }
        return count;  // Return the count of even numbers
    }
}

public class Demo068 {
    public static void main(String[] args) {
        PrintEvenCount obj = new PrintEvenCount();
        int[] arr = {10, 50, 89, 90, 23, 100, 59};  // Input array
        int count = obj.evenCount(arr);  // Get the count of even numbers
        System.out.println("\nTotal even numbers: " + count);  // Print the total count
    }
}
