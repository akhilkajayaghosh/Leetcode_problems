class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int a=nums1.length;
        int b=nums2.length;
        int s=a+b;
        int arr[]=new int[s];
        int i=0,j=0,k=0;
        while(i<a && j<b)
        {
            if(k>s/2) break;
            if(nums1[i]<=nums2[j]){
                arr[k++]=nums1[i++];
            }
            else{
                arr[k++]=nums2[j++];
            }
        }
        if(i<a)
        {
            for(int m=i;m<a;m++)
            {
                if(m>s/2) break;
                arr[k++]=nums1[m];
            }
        }
        else if(j<b)
        {
            for(int m=j;m<b;m++)
            {
                if(m>s/2) break;
                arr[k++]=nums2[m];
            }            
        }
        if(s%2==0)
        {
            int m1=s/2;
            int m2=m1-1;
            double a1=arr[m1];
            double a2=arr[m2];
            double res=(a1+a2)/2;
            return res;
        }
        else{
            int m=s/2;
            return arr[m];
        }
    }
}