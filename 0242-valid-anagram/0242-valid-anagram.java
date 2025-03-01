class Solution {
    public boolean isAnagram(String s, String t) {
        int m=s.length();
        int n=t.length();
        HashMap<Character,Integer> m1=new HashMap<>();
        HashMap<Character,Integer> m2=new HashMap<>();
        for(int i=0;i<m;i++)
            m1.put(s.charAt(i),m1.getOrDefault(s.charAt(i),0)+1);
        for(int i=0;i<n;i++)
            m2.put(t.charAt(i),m2.getOrDefault(t.charAt(i),0)+1);
        if(m1.equals(m2))
            return true;
        else
            return false;        
    }
}