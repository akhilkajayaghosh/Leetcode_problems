class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int start=0;
        int res[]=new int[n];
        ArrayList<Integer> num=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            num.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++)
        {
            if(num.contains(nums2[i]))
            {
                res[start++]=nums2[i];
                num.remove(Integer.valueOf(nums2[i]));
            }
        }
        return Arrays.copyOfRange(res, 0, start);
    }
}