class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length==0)  return 0;
        int curr_max=nums[0];
        int glob_max=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            curr_max=Math.max(nums[i],curr_max+nums[i]);
            glob_max=Math.max(glob_max,curr_max);
        }
        return glob_max;
    }
}