class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int top =0;
        int bottom=matrix.length-1;
        int left=0;
        int right=matrix[0].length-1;
        List <Integer> arr = new ArrayList<>();
        while(top<=bottom && left<=right){
            for(int j =left;j<=right;j++){
                arr.add(matrix[top][j]);
            }
            top++;
            for(int i =top;i<=bottom;i++){
                arr.add(matrix[i][right]);
            }
            right--;
             if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    arr.add(matrix[bottom][j]);
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    arr.add(matrix[i][left]);
                }
                left++;
            }
        }
        return arr;
    }
}