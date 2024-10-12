class Solution {
    public String reverseWords(String s) {
        String nums[]=s.trim().split("\\s+");
        StringBuilder sb=new StringBuilder();
        for(int i=nums.length-1;i>=0;i--)
            sb.append(nums[i]).append(" ");
        return sb.toString().trim();
    }}
