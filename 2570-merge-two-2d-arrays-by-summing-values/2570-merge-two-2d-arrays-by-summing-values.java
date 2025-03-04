class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        TreeMap<Integer,Integer> mp=new TreeMap<>();
        int m=nums1.length;
        int n=nums2.length;
        for(int i=0;i<m;i++)
            mp.put(nums1[i][0],nums1[i][1]);
        for(int i=0;i<n;i++)
        {
            if(mp.containsKey(nums2[i][0]))
            { 
                mp.put(nums2[i][0],mp.get(nums2[i][0])+nums2[i][1]);
            }
            else
                mp.put(nums2[i][0],nums2[i][1]);
        }
        int k=mp.size();
        int arr[][]=new int[k][2];
        int index = 0;
        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            arr[index][0] = entry.getKey();
            arr[index][1] = entry.getValue();
            index++;
        }
        return arr;
    }
}