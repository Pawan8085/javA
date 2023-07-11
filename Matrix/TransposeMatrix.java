package javA.Matrix;

public class TransposeMatrix {
    
    public void transpose(int n,int matrix[][])
    {
        //GFG : Transpose Matrix 
    
        for(int i=0;i<n;++i){
           
            for(int j=0;j<=i;++j){
                 int temp = matrix[i][j];
               matrix[i][j]=matrix[j][i];
               matrix[j][i]=temp;
            }
        }
        
    }
}
