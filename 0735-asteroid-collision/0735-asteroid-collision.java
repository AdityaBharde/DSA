class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack=new Stack<>();
        for(int asteroid:asteroids){
            while(!stack.isEmpty() && stack.peek()>0 && asteroid<0 && stack.peek()<Math.abs(asteroid)){
                stack.pop();
            }
            if(stack.isEmpty() || asteroid>0 || stack.peek()<0){
                stack.push(asteroid);
            } else if(stack.peek()+asteroid==0){
                stack.pop();
            }
        }
        int[] res=new int[stack.size()];
        for(int i=0;i<stack.size();i++){
            res[i]=stack.get(i);
        }
        return res;
    }
}