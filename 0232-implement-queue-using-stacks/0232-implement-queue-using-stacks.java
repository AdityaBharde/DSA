class MyQueue {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2= new Stack<>();
    public MyQueue() {

    }

    public void push(int x) {
        stack1.push(x);
    }

    public int pop() {
        while (stack1.size()!=1){
            stack2.push(stack1.pop());
        }
        int x=stack1.pop();
        while (!stack2.empty()){
            stack1.push(stack2.pop());
        }
        return x;
    }

    public int peek() {
        while (stack1.size()!=1){
            stack2.push(stack1.pop());
        }
        int x=stack1.peek();
        while (!stack2.empty()){
            stack1.push(stack2.pop());
        }
        return x;
    }

    public boolean empty() {
        return stack1.empty();
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