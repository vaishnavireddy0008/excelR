public class Demo075 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 9, 2, 8};
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("The maximum number in the array is: " + max);
    }
}
