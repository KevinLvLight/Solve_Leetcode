/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        Set<ListNode> nodeFound = new HashSet<>();
        while(head != null){
            if(nodeFound.contains(head)){
                return head;
            }else{
                nodeFound.add(head);
            }
            head = head.next;
        }
        return null;
    }
}