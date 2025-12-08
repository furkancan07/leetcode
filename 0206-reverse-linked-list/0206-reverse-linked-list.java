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
    public ListNode reverseList(ListNode head) {
    /*    //sorting deki swap işlemini yaptık
        ListNode temp=head;
        ListNode next=null;
        ListNode before=null;
        while(temp!=null){
            next=temp.next;
            temp.next=before; //4 3 2 1 
            before=temp; /// 5 4 3 2 1
            temp=next; 
        }
        return before; // temp  // 5 4 3 2 1
        */
        /*if(head==null) return null;
        Stack<Integer> stack=new Stack<>();
        ListNode current=head;
        while(current!=null){
            stack.push(current.val);
            current=current.next;
        }
        ListNode reversed=new ListNode(stack.pop());
        current=reversed;
        while(!stack.isEmpty()){
            ListNode node=new ListNode(stack.pop());
            current.next=node;
            current=node;
        }
        return reversed;*/
        ListNode onceki=null;
        ListNode simdi=head;
        
        while(simdi!=null){
            ListNode sonraki=simdi.next;
            simdi.next=onceki;
            onceki=simdi;
            simdi=sonraki;
            
        }
        return onceki;
    }
}