class Solution {
    public void setZeroes(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int flag[][]=new int [m][n];
        HashSet<Integer>rw=new HashSet<>();
        HashSet<Integer>cl=new HashSet<>();
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(matrix[i][j]==0)
                {
                    rw.add(i);
                    cl.add(j);
                }
            }
        }
        for(int i=0;i<m;i++)
        {
            if(rw.contains(i))
            {
            for(int j=0;j<n;j++)
                {
                    matrix[i][j]=0;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            if(cl.contains(i))
            {
            for(int j=0;j<m;j++)
                {
                    matrix[j][i]=0;
                }
            }
        }        
    }
}