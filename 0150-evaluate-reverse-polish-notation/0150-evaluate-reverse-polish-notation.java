class Solution {
    public int evalRPN(String[] tokens) {
     
           Stack<Integer> stack=new Stack<>();
        for(String token : tokens){
            switch(token){
                case "+" : 
                stack.push(stack.pop()+stack.pop());
                break;
                case "-" : 
                int first =stack.pop(); 
                int end =stack.pop(); 
                stack.push(end-first);
                break;
                case "*" :
                stack.push(stack.pop()*stack.pop());
                 break;
                case "/" : 
                 first =stack.pop(); 
                 end =stack.pop(); 
                stack.push(end/first);
                break;
                default : stack.push(Integer.parseInt(token)); break;
            }
        }
        
        
        return stack.pop();
    }
}