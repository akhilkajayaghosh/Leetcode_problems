class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        int m=s1.length();
        int n=s2.length();
        String str1[]=s1.split(" ");
        ArrayList<String> arr=new ArrayList<>();
        HashMap<String,Integer> mp=new HashMap<>();
        for(int i=0;i<str1.length;i++)
        {
            mp.put(str1[i],mp.getOrDefault(str1[i],0)+1);
        }
        String str2[]=s2.split(" ");
        for(int i=0;i<str2.length;i++)
        {
            mp.put(str2[i],mp.getOrDefault(str2[i],0)+1);
        }
        for (Map.Entry<String, Integer> map: mp.entrySet()) {
            if(map.getValue()==1)
                arr.add(map.getKey());
        }
        String[] str = arr.toArray(new String[0]);
        return str;
    }
}