class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int n=nums.length;
        int arr[]=new int[n-k+1];
        for(int i=0;i<=n-k;i++)
        {
            int val=1;
            int max1=nums[i];
            for(int j=i+1;j<=i+k-1;j++)
            {
                if(nums[j]!=(nums[j-1]+1))
                    val=0;
                max1=Math.max(max1,nums[j]);
            }
            if(val==1)
                arr[i]=max1;
            else
                arr[i]=-1;
        }
        return arr;
    }
}