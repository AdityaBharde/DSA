class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }
        public boolean solve(char[][] board) {
        int n = board.length;
        int row = -1;
        int column=-1;

        boolean emptyLeft= true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(board[i][j]=='.'){
                    row=i;
                    column=j;
                    emptyLeft=false;
                    break;
                }
            }
            if (emptyLeft==false){
                break;
            }
        }
        if(emptyLeft==true){
            return true;
        }
        for (int num = 1; num <= 9; num++) {
            if (isSafe(board,(char)('0'+num),row,column)){
                board[row][column]=(char)('0'+num);
                if (solve(board)){
                    return true;
                }else {
                    board[row][column]='.';
                }
            }
        }
        return false;
    }


    public boolean isSafe(char[][] board , char ch , int r , int c){
        for(int i= 0 ; i< board.length;i++){
            if(board[r][i]== ch || board[i][c]== ch){
                return false;
            }
        }
        int r1=r-r%3;
        int c1=c-c%3;
        for(int i=0;i<=2;i++){
            for(int j =0 ; j<=2;j++){
                if(board[r1+i][c1+j]==ch){
                    return false;
                }
            }
        }


        return true;
    }


}