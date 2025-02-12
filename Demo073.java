public class Demo073 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 2, 7, 8, 8, 3};
        
        System.out.println("Original array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        
        System.out.println("\nDuplicate elements: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.println(array[i]);
                    break; 
                }
            }
        }
    }
}
