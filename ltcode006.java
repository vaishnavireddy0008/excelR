class ltcode006 {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0; // Return 0 if the array is empty
        }

        int k = 1; // Initialize a counter for unique elements

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) { // Check if the current element is different from the previous one
                nums[k] = nums[i]; // Assign the unique element to the next position
                k++; // Increment the counter
            }
        }

        return k; // Return the count of unique elements
    }

    public static void main(String[] args) {
        ltcode006 ltcode006 = new ltcode006(); // Create an instance of the Solution class
        int[] nums = {1, 1, 2, 3, 3, 4}; // Example input array
        int newLength = ltcode006.removeDuplicates(nums); // Call the method to remove duplicates
        
        // Print the results
        System.out.println("New length: " + newLength);
        System.out.print("Modified array: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " "); // Print the unique elements
        }
    }
}