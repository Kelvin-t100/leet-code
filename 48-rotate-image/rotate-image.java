class Solution {
    public void rotate(int[][] matrix) {
        int temp[][]=new int[matrix.length][matrix.length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                temp[i][j]=matrix[j][i];
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                matrix[i][j]=temp[i][matrix.length-j-1];
            }
        }
    
        for(int i[]:temp){
            for(int j:i){
                System.out.print(j);
            }
        }
        
    }
}