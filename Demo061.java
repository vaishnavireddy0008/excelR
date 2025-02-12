public class Demo061 {
    public static void main(String[] args) {
        for (int i = 2; i <= 10; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
