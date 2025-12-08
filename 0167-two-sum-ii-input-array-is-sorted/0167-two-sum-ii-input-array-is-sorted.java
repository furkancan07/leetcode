/*
küçükten büyüğe sıralnmıl dizi 
numbers[i]+numbers[j]=target;


2,7,11,15     target=18 2+15 7+15 23 7+11 17
l=0;
r=length-1
result=n[l]+n[r] 
if(result<target) i++
else if(result>target) r--
else return i+1,j+1
 */
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i=0; // left
        int j=numbers.length-1; // right 
        while(i<j){
            int result=numbers[i]+numbers[j];
            if(result<target) i++;
            else if(result>target) j--;
            else return new int[]{i+1,j+1};
        }
        return new int[]{};

        
    }
}