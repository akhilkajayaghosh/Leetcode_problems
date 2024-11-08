class Solution(object):
    def arrayPairSum(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        nums.sort()
        res=0
        res=sum(nums[i] for i in range(0,len(nums),2))
        
        return res