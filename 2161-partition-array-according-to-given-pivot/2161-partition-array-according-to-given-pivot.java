class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n=nums.length;
        int ne=0,nl=0,ng=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==pivot)  ne+=1;
            else if(nums[i]<pivot) nl+=1;
            else    ng+=1;
        }
        int l[]=new int[nl];
        int g[]=new int[ng];
        int k=0,m=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]<pivot) l[k++]=nums[i];
            else if(nums[i]>pivot) g[m++]=nums[i];
        }
        for(int i=0;i<nl;i++)
            nums[i]=l[i];
        for(int i=0;i<ne;i++)
            nums[nl++]=pivot;
        for(int i=0;i<ng;i++)
        {
            nums[nl++]=g[i];
        }
        return nums;
    }
}