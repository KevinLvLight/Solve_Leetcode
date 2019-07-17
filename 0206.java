/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {

    /**
     * 非递归方法
     */
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode p = head;
        ListNode nHead = null;
        ListNode pTmp = null;
        while(p != null){
            pTmp = p.next;
            p.next = nHead;
            nHead = p;
            p = pTmp;
        }
        return nHead;  
    }

    /**
     * 递归方法
     */
    public ListNode reverseList2(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode ln = reverseList2(head.next);
        head.next.next = head;
        head.next = null;
        return ln;
        
    }
}