

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        Queue<ListNode> queue = new LinkedList<>();

        
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                queue.add(list1);
                list1 = list1.next;
            } else {
                queue.add(list2);
                list2 = list2.next;
            }
        }

       
        while (list1 != null) {
            queue.add(list1);
            list1 = list1.next;
        }
        while (list2 != null) {
            queue.add(list2);
            list2 = list2.next;
        }

       
        ListNode head = new ListNode(-1); 
        ListNode temp = head;

        while (!queue.isEmpty()) {
            temp.next = queue.poll(); 
            temp = temp.next;       
        }

        
        temp.next = null;

        
        return head.next;
    }
}
