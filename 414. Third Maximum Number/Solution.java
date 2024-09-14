class Solution {
    public int thirdMax(int[] nums) {
        Long p = Long.MIN_VALUE;
        Long q = Long.MIN_VALUE;
        Long r = Long.MIN_VALUE;
        int flag=0;
        System.out.println(r);
        for(int i=0;i<nums.length;i++)
        {
            if (nums[i] == p || nums[i] == q || nums[i] == r) {
                continue;
            }
            if (nums[i] > p) {
                r = q;
                q = p;
                p = (long) nums[i];
            } else if (nums[i] > q) {
                r = q;
                q = (long) nums[i];
            } else if (nums[i] > r) {
                r = (long) nums[i];
            }
        }
        return (r == Long.MIN_VALUE) ? p.intValue() : r.intValue();
    }
}