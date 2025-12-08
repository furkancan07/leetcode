/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode node=reverse(head);
        ListNode temp=node;
        if(n==1){
            node=node.next;
        }
        else {
            for(int i = 0; i < n-2; i++){  
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
       
        return reverse(node);
    }
    public ListNode reverse(ListNode head){
        if(head==null || head.next==null) return head;
        ListNode current=head;
        ListNode before=null;
        while(current!=null){
            ListNode next=current.next;
            current.next=before;
            before=current;
            current=next;
        }
        return before;
    }


}