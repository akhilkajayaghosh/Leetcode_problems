class Solution {
    public void moveZeroes(int[] nums) {
        int arr[]=new int[nums.length];
        int j=0;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            if(nums[i]!=0)
                arr[j++]=nums[i];
        }
        for(int i=j;i<n;i++)
            arr[i]=0;
        for(int i=0;i<n;i++)
            nums[i]=arr[i];
    }
}