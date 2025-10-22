class CustomStack {
    int[] stack;
    int top=-1;
    int size;
    public CustomStack(int maxSize){
        stack=new int[maxSize];
        size=maxSize;
    }
    public void push(int x){
        if(top<size-1){
            top++;
            stack[top]=x;
        }
    }
    public int pop(){
        if(top==-1){
            return -1;
        }
        int val=stack[top];
        top--;
        return val;
    }
    public void increment(int k,int val){
        int limit=Math.min(k,top+1);
        for(int i=0;i<limit;i++){
            stack[i]+=val;
        }
    }
}
