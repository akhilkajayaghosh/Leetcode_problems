class Solution {
    public int[] twoSum(int[] nums, int target) {
        int arr[]=new int[2];
        int n=nums.length;
        int flag=0;
        for(int i=0;i<n-1;i++)
        {
            if(flag==0){
            int val=target-nums[i];
            arr[0]=i;
            for(int j=i+1;j<n;j++)
            {
                if(nums[j]==val)
                {
                    arr[1]=j;
                    flag=1;
                    break;
                }
            }
            }
        }
        return arr;
    }
}