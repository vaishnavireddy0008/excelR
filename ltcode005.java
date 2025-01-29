import java.util.HashMap;

public class ltcode005 {
    public int[] twoSum(int[] nums, int target) {
   
        HashMap<Integer, Integer> numToIndex = new HashMap<>();
        
       
        for (int i = 0; i < nums.length; i++) {
        
            int complement = target - nums[i];
            
            if (numToIndex.containsKey(complement)) {
                
                return new int[] { numToIndex.get(complement), i };
            }
            
            // Otherwise, add the number and its index to the HashMap
            numToIndex.put(nums[i], i);
        }
        
        // Since the problem guarantees one solution, we should never reach here
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        ltcode005 ltcode005 = new ltcode005();
        
        // Example usage
        int[] result1 = ltcode005.twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println("Output: [" + result1[0] + ", " + result1[1] + "]"); 
        int[] result2 = ltcode005.twoSum(new int[]{3, 2, 4}, 6);
        System.out.println("Output: [" + result2[0] + ", " + result2[1] + "]"); 
        
        int[] result3 = ltcode005.twoSum(new int[]{3, 3}, 6);
        System.out.println("Output: [" + result3[0] + ", " + result3[1] + "]"); 
    }
}