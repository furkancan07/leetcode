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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        /*List<Integer> list=new ArrayList<>();
        while(list1!=null){
            list.add(list1.val);
            list1=list1.next;
        }
          while(list2!=null){
            list.add(list2.val);
            list2=list2.next;
        }
        list.sort(Integer::compare);
        ListNode node=new ListNode();
        ListNode temp=node;
        for(int i : list){
            temp.next=new ListNode(i);
            temp=temp.next;
        }
        return node.next;*/
        ListNode result=new ListNode();
        ListNode node=result;
        while(list1!=null && list2!=null){
            if(list1.val<list2.val){
                node.next=new ListNode(list1.val);
                list1=list1.next;
            }
            else{
                node.next=new ListNode(list2.val);
                list2=list2.next;
            }
            node=node.next;
        }
       if(list1!=null){
             node.next=list1;
          
        }
         if(list2!=null){
             node.next=list2;
            
        }
        return result.next;
    }
}