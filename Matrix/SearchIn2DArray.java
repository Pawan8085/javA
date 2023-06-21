package javA.Matrix;

public class SearchIn2DArray {
    // Leetcode : 74. Search a 2D Matrix
    // Alog : Binary Search 
    
     public boolean searchMatrix(int[][] matrix, int target) {
        for(int i=0;i<matrix.length;++i){
           if(bSearch(i, matrix[0].length, target, matrix))return true;
            
        }
        return false;
    }

    public boolean bSearch(int row, int n, int target, int[][] mat){

        int left=0;
        int right=n-1;

        while(left<=right){
            int mid=(left+right)/2;

            if(mat[row][mid]==target)return true;
            else if(mat[row][mid]>target){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }

        return false;
    }
}
