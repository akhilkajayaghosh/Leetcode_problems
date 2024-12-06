class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer,String> mp=new HashMap<>();
        ArrayList<Integer> arr=new ArrayList<>();
        int n=names.length;
        String str[]=new String[n];
        for(int i=0;i<n;i++)
        {
            mp.put(heights[i],names[i]);
            arr.add(heights[i]);
        }
        Collections.sort(arr,Collections.reverseOrder());
        for(int i=0;i<n;i++)
        {
            str[i]=mp.get(arr.get(i));
        }
        return str;
    }
}