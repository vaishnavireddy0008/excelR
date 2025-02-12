public class Demo063 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        if (arr.length > 0) {
            int sum = arr[0] + arr[arr.length - 1];
            System.out.println("Sum of the elements: " + sum);
        } else {
            System.out.println("Array is empty");
        }
    }
}
