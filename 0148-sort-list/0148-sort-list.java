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

    public ListNode sortList(ListNode head) {
      if(head==null || head.next==null) return head;
     
      ListNode left=head; 
      ListNode right=getMid(head);

      left=sortList(left);
      right=sortList(right);


      return merge(left,right);

        
    }
// 2 ye ayırmak için ortasını bul
    public ListNode getMid(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        ListNode before=null;
        while(fast!=null && fast.next!=null){
            before=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        if(before.next!=null) before.next=null;
        return slow;
    }
    public ListNode merge(ListNode l1,ListNode l2){
        ListNode node=new ListNode();
        ListNode temp=node;

        while(l1!=null && l2!=null){
            if(l1.val<l2.val){
                temp.next=l1;
                l1=l1.next;
            }else{
                temp.next=l2;
                l2=l2.next;
            }
            temp=temp.next;
        }

        if(l1!=null) temp.next=l1;

        if(l2!=null) temp.next=l2;

        return node.next;
    }
}