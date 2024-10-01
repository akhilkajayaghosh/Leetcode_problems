class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        int flag[][]=new int[n][n];
        for(int i=0;i<n/2;i++)
        {
            for(int j=0;j<n;j++)
            {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[n-i-1][j];
                matrix[n-i-1][j]=temp;
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(flag[i][j]==0)
                {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
                flag[j][i]=1;
                }
            }
        }
    }
}