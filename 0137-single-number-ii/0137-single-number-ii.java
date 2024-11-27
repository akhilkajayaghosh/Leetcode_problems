class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> e:mp.entrySet())
        {
            if(e.getValue()==1)
                return e.getKey();
        }
        return -1;
    }
}