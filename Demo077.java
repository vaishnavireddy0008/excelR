public class Demo077 {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};
        int[] copiedArray = originalArray.clone();
        
        for (int num : copiedArray) {
            System.out.print(num + " ");
        }
    }
}
