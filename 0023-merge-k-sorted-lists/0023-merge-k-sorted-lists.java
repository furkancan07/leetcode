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
    public ListNode mergeKLists(ListNode[] lists) {
       if (lists == null || lists.length == 0) return null;
       List<Integer> result=new ArrayList<>();
        for(ListNode list : lists){
            while (list!=null){
                result.add(list.val);
                list=list.next;
            }
        }
        result.sort(Integer::compare);
        ListNode node=new ListNode();
        ListNode temp=node;
        for(int i : result){
            temp.next=new ListNode(i);
            temp=temp.next;
        }
        return node.next;
       
      /*  ListNode l1=lists[0];
         for(int i=1;i<lists.length;i++){
            l1=merge(l1,lists[i]);
         }
         return l1;*/
    }
   /* public ListNode merge(ListNode l1,ListNode l2){
        if(l1==null) return l2;
        if(l2==null) return l1;
        ListNode node=new ListNode();
        ListNode temp=node;
        while(l1!=null && l2!=null){
            if(l1.val<l2.val){
                 temp.next=new ListNode(l1.val);
                 l1=l1.next;
            }else{
                temp.next=new ListNode(l2.val);
                 l2=l2.next;
            }
            temp=temp.next;
        }
        if(l1!=null) temp.next=l1;
        if(l2!=null) temp.next=l2;

        return node.next;
    }*/
    
}