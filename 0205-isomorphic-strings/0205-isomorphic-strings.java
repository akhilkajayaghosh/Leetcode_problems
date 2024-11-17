class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())
            return false;
        HashMap<Character,Character> mp=new HashMap<>();
        Set<Character> st=new HashSet<>();
        for(int i=0;i<s.length();i++)
        {
            char c1=s.charAt(i);
            char c2=t.charAt(i);
            if(mp.containsKey(c1))
            {
                if(mp.get(c1)!=c2)
                    return false;
            }
            else
            {
                if(st.contains(c2))
                    return false;
            }
            mp.put(c1,c2);
            st.add(c2);
        }
        return true;
    }
}