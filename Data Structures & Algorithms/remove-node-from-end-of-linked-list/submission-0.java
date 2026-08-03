class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Step 1: Store all nodes in an ArrayList
        ArrayList<ListNode> list = new ArrayList<>();
        ListNode temp = head;
        
        // Traverse the list and add nodes to the list
        while (temp != null) {
            list.add(temp);
            temp = temp.next;
        }

        // Step 2: Identify the node to remove
        int size = list.size();
        // If the node to remove is the head node
        if (n == size) {
            return head.next;
        }

        // Otherwise, remove the nth node from the end
        ListNode prev = list.get(size - n - 1);
        prev.next = prev.next.next; // Remove nth node by skipping it

        return head;
    }
}
