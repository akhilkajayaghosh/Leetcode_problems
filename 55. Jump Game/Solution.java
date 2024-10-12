class Solution {
    public boolean canJump(int[] nums) {
        int f=0;
        for(int i=0;i<nums.length;i++)
        {
            if(i>f)
                return false;
            if(f>=nums.length-1)
                return true;
            f=Math.max(f,i+nums[i]);
        }
        return true;
    }
}