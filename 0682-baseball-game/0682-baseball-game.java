class Solution {
    // int ise kaydet
    // + ise önceki 2 sayıyı topla ve kaydet
    // D ise önceki puanın 2 katını kaydet
    // c ise önceki 1 sayıyı sil
    public int calPoints(String[] operations) {
        Deque<Integer> stack=new ArrayDeque<>();
        for(String s : operations){
            switch(s){
                case "+" : sum(stack);
                break;
                case "D" : stack.push(2*stack.peek());
                break; 
                case "C" : stack.pop();
                break;
                default : stack.push(Integer.parseInt(s));
                break;
            }
        }
        int result=0;
        while(!stack.isEmpty()){
            result+=stack.pop();
        }
        return result;
        
    }
    public void sum(Deque<Integer> stack){
         int size=stack.size();
        if(size>=2){
            int result=stack.pop();
            int result2=stack.peek()+result;
            stack.push(result);
            stack.push(result2);
        }

    }
}