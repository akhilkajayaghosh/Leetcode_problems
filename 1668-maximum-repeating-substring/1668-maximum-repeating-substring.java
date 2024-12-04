class Solution {
    public int maxRepeating(String sequence, String word) {
        StringBuilder sb=new StringBuilder();
        sb.append(word);
        int count=0;
        while(sequence.contains(sb.toString()))
        {
            count++;
            sb=sb.append(word);
        }
        return count;
    }
}