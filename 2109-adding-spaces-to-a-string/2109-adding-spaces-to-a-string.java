class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb=new StringBuilder();
        sb.append(s);
        
        // sb.insert(spaces[0]," ");
        // return sb.toString();
        for(int i=0;i<spaces.length;i++)
        {
            sb.insert(spaces[i]+i," ");
        }
        return sb.toString();
    }
}