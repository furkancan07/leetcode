class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        // 12 -4 3 5 -10
        Deque<Integer> stack=new ArrayDeque<>();
        for(int i : asteroids){
            boolean control=true;
           while(!stack.isEmpty() && i<0 && stack.peek()>0 && control){
             if(stack.peek()<-i) stack.pop();
             else if(stack.peek()==-i){
                     stack.pop(); 
                     control=false;
                     }
             else control=false; 
           } 
            if(control) stack.push(i);
        }
        
   

        int[] array=new int[stack.size()];
        int index=stack.size()-1;
        while(!stack.isEmpty()){
            array[index--]=stack.pop();
        }
        return array;
        
    }
}