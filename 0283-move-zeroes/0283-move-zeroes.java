class Solution {
    public void moveZeroes(int[] nums) {
        ArrayList<Integer>arr=new ArrayList<>();
        int n=nums.length;
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==0)
                count++;
            else
                arr.add(nums[i]);
        }
        for(int i=0;i<arr.size();i++)
        {
            nums[i]=arr.get(i);
        }
        int an=arr.size();
        for(int i=0;i<count;i++)
        {
            nums[an++]=0;
        }
    }
}