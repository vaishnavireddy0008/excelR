class ltcode007 {
    public int[] plusOne(int[] digits) {
        
        for (int i = digits.length - 1; i >= 0; i--) {
            
            if (digits[i] < 9) {
                digits[i]++; 
                return digits;
            }
            
            digits[i] = 0;
        }
        
        
        int[] newNumber = new int[digits.length + 1];
        newNumber[0] = 1; 
        return newNumber; 
    }

    public static void main(String[] args) {
        ltcode007 ltcode007 = new ltcode007();
        
        // Test cases
        int[] digits1 = {1, 2, 3};
        int[] result1 = ltcode007.plusOne(digits1);
        System.out.print("Output: ");
        for (int digit : result1) {
            System.out.print(digit + " ");
        }
        System.out.println();

        int[] digits2 = {4, 3, 2, 1};
        int[] result2 = ltcode007.plusOne(digits2);
        System.out.print("Output: ");
        for (int digit : result2) {
            System.out.print(digit + " ");
        }
        System.out.println();

        int[] digits3 = {9};
        int[] result3 = ltcode007.plusOne(digits3);
        System.out.print("Output: ");
        for (int digit : result3) {
            System.out.print(digit + " ");
        }
        System.out.println();
    }
}