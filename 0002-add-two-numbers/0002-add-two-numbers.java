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
    
    
     public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null) return l2;
        if(l2==null) return l1;

        String s1=convertString(l1);
        String s2=convertString(l2);

       

        String result=sum(s1,s2);

       

        ListNode node=new ListNode();
        ListNode temp=node;
        
        for(int i=0;i<result.length();i++){
            temp.next=new ListNode(result.charAt(i)-'0');
            temp=temp.next;
        }
        return node.next;
        
    }
    public String convertString(ListNode l1){
        StringBuilder sb=new StringBuilder();
        while(l1!=null){
            sb.append(l1.val);
            l1=l1.next;
        }
        return sb.reverse().toString();
    }
    public String sum(String s1,String s2){
        StringBuilder sb=new StringBuilder();
        int i=s1.length()-1;
        int j=s2.length()-1;
        int carry=0;
        while(i>=0 || j>=0 || carry!=0){
            int sum=carry;
            if(i>=0) sum+=s1.charAt(i--)-'0';
            if(j>=0) sum+=s2.charAt(j--)-'0';

            sb.append(sum%10);
            carry=sum/10;
        }
        return sb.toString();
    }
     
}