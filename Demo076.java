public class Demo076 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 9, 2, 8};
        int max = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE;
        
        for (int num : arr) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num != max) {
                secondMax = num;
            }
        }
        
        System.out.println("Second maximum: " + secondMax);
    }
}