/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head== null || head.next == null) return null;
        ListNode fast = head, slow = head;
        boolean samePoint = false;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next; 
            if (slow == fast){
                samePoint = true;
                break;
            }
        }
        
        if (!samePoint) return null;
        
        fast = head;
        while(slow!=fast){
            slow = slow.next;
            fast = fast.next;
        }
        
        return slow;
    }
}
