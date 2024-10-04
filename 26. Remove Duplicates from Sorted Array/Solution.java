class Solution {
    public int removeDuplicates(int[] nums) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        int j=0;
        for(int i=0;i<nums.length;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
            if(mp.get(nums[i])==1)
                {
                    nums[j]=nums[i];
                    j++;
                }
                else 
                    continue;
        }
        return j;
    }
}