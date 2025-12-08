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
    public void reorderList(ListNode head) {
        if(head==null || head.next==null) return;
       // diziyi 2 ye böl
       ListNode mid=getMid(head); // 3 4 5
       // sağı reverse et
       ListNode second=reverse(mid); // 5 4 3
       // merge et bir soldan bir sağdan
       merge(head,second);
        
    }
    public ListNode getMid(ListNode head){
        ListNode slow=head,fast=head,before=null;
        while(fast!=null && fast.next!=null){
            before=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        if(before!=null) before.next=null;
        return slow;
    }
    public ListNode reverse(ListNode head){
        if(head==null || head.next==null) return head;
        ListNode onceki=null;
        ListNode simdi=head;
        while(simdi!=null){
            ListNode sonraki=simdi.next;
            simdi.next=onceki;
            onceki=simdi;
            simdi=sonraki;// 4 3
        }
        return onceki;
    }
    // 1 2 , 5 4 3
    public void merge(ListNode first,ListNode second){
        while(first!=null && second!=null){
            ListNode tmp1=first.next; // 2
            ListNode tmp2=second.next; // 4

            first.next=second;
            if(tmp1==null) break;
            second.next=tmp1;

            first=tmp1;
            second=tmp2;
        }
    }
}