public class Demo070 {
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {10, 17, 23, 4, 9, 7, 11, 15};
        for (int num : arr) {
            if (isPrime(num)) System.out.print(num + " ");
        }
    }
}
