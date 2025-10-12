class Solution {
    public List<List<Integer>> combinationSum(int[] c, int target) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(c, target, 0, new ArrayList<>(), res);
        return res;
    }

    void backtrack(int[] c, int target, int idx, List<Integer> curr, List<List<Integer>> res) {
        if(target==0){
            res.add(new ArrayList<>(curr));
            return;
        }
        if(target<0 || idx == c.length ){
            return;
        }
        curr.add(c[idx]);
        backtrack(c,target-c[idx],idx,curr,res);
        curr.remove(curr.size()-1);
        backtrack(c,target,idx+1,curr,res);

    }

}