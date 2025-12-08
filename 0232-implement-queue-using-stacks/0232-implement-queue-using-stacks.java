class MyQueue {
    int kapasite;
    int[] dizi;
    int ilk;
    int son;
    int size;
    
    public MyQueue() {
    this.kapasite=101;
    dizi=new int[kapasite];
    this.size=0;
    ilk=0;
    son=-1;    
    }
    
    public void push(int x) {
        if(isFull()) return;
        son=(son+1)%kapasite;
        dizi[son]=x;
        size++;
    }
    
    public int pop() {
        if(empty()) return -1;
        int x=dizi[ilk];
        ilk=(ilk+1)%kapasite;
        size--;
        return x;
    }
    
    public int peek() {
       if(empty()) return -1;
       return dizi[ilk];  
    }
    
    public boolean empty() {
        return size==0;
    }
    public boolean isFull(){
        return size==kapasite;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */

 /*
 class MyQueue {
    Stack<Integer> in;
    Stack<Integer> out;

    public MyQueue() {
        in = new Stack<>();
        out = new Stack<>();
    }

    public void push(int x) {
        in.push(x);
    }

    public int pop() {
        shiftStacks();
        return out.pop();
    }

    public int peek() {
        shiftStacks();
        return out.peek();
    }

    public boolean empty() {
        return in.isEmpty() && out.isEmpty();
    }

    private void shiftStacks() {
        if(out.isEmpty()){
            while(!in.isEmpty()){
                out.push(in.pop());
            }
        }
    }
}
*/