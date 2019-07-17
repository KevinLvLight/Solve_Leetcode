/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 0;
        ListNode newHead = new ListNode(0);
        newHead.next = head;
        ListNode p = newHead;
        ListNode q = newHead;
        while(q != null){

            if(count <= n){
                count ++;
                q = q.next;
            }else{
                q = q.next;
                p = p.next;
            }
        }
            p.next = p.next.next;
            return newHead.next;
    }
}