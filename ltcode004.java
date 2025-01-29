public class ltcode004 {
    
    
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);  // Placeholder node to simplify the code.
        ListNode current = dummyHead;  // Pointer to construct the new linked list.
        int carry = 0;  
        
        // Iterate through both lists while there are still digits to process or a carry.
        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;  // Start with the carry from the previous step.
            
            if (l1 != null) {
                sum += l1.val;  // Add the value of l1 if available.
                l1 = l1.next;  // Move to the next node in l1.
            }
            
            if (l2 != null) {
                sum += l2.val;  // Add the value of l2 if available.
                l2 = l2.next;  // Move to the next node in l2.
            }
            
            carry = sum / 10;  // Update the carry for the next step.
            current.next = new ListNode(sum % 10);  // Create a new node for the digit (sum modulo 10).
            current = current.next;  // Move to the next node in the result list.
        }
        
        return dummyHead.next;  // Return the next of the dummy node, which is the head of the result list.
    }

    // Helper function to print a linked list (for testing)
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Main function for testing
    public static void main(String[] args) {
        // Example 1:
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3))); // Represents 342
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4))); // Represents 465
        
        ltcode004 solution = new ltcode004();  // Instantiate the class with the solution method
        ListNode result = solution.addTwoNumbers(l1, l2);
        
        // Expected Output: [7, 0, 8]
        printList(result);
    }
}

