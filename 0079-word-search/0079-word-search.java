class Solution {
    public boolean exist(char[][] board, String word) {
        int m = board.length,n = board[0].length;
        for (int i =0;i<m;i++) {
            for (int j=0;j<n;j++) {
                if (helper(board, word,i,j,0)) {
                    return true;
                }
            }
        }
        return false;
    }
    public boolean helper(char [][]arr,String word,int r,int c,int n){
        if (r==arr.length || c==arr[0].length || r==-1 || c==-1 || word.charAt(n)!=arr[r][c]){
            return false;
        }
        if(n==word.length()-1){
            return true;
        }
        char temp = arr[r][c];
        arr[r][c]='#';
        boolean found = helper(arr, word, r + 1, c,n + 1) ||
                        helper(arr, word, r - 1, c,n + 1) ||
                        helper(arr, word, r, c + 1,n + 1) ||
                        helper(arr, word, r, c - 1,n + 1);
        arr[r][c]=temp;
        return found;
    }
}