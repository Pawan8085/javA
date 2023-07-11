package javA.Matrix;

public class RowWithMaxOne {
    
    // Leetcode : 2643. Row With Maximum Ones

    public int[] rowAndMaximumOnes(int[][] mat) {
        
        int ind = 0; int count=0;
        for(int i=0;i<mat.length;++i){
            int one = 0;
            for(int j=0; j<mat[0].length;++j){

                if(mat[i][j]==1)one++;
            }

            if(one>count){
                count=one;
                ind=i;
            }
        }

        return new int[]{ind, count};
    }
}
