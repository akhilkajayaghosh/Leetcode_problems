class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n=arr.length;
        if(n==0) return new int[0];
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=arr[i];
        Arrays.sort(a);
        HashMap<Integer,Integer> mp=new HashMap<>();
        mp.put(a[0],1);
        int count=1;
        for(int i=1;i<n;i++)
        {
            if(a[i]==a[i-1])
                mp.put(a[i],count);
            else
            {
                count++;
                mp.put(a[i],count);
            }
        }
        for(int i=0;i<n;i++)
            arr[i]=mp.get(arr[i]);
        return arr;
    }
}