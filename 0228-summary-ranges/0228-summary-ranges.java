class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        if (nums.length == 0) return result;  // Handle empty input
        
        int start = nums[0];  // Start of the range
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1] + 1) {  // Break in sequence
                if (start == nums[i - 1]) {  // Single number range
                    result.add(String.valueOf(start));
                } else {  // Range with multiple numbers
                    result.add(start + "->" + nums[i - 1]);
                }
                start = nums[i];  // Update start for new range
            }
        }
        
        // Add the last range
        if (start == nums[nums.length - 1]) {
            result.add(String.valueOf(start));
        } else {
            result.add(start + "->" + nums[nums.length - 1]);
        }

        return result;
    }
}