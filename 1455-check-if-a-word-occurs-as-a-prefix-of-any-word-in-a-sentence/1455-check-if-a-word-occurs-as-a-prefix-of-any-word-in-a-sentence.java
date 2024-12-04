class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String str[]=sentence.split(" ");
        int k=searchWord.length();
        int n=str.length;
        for(int i=0;i<n;i++)
        {
            int m=str[i].length();
            if(m>=k)
            {
                if((str[i].substring(0,k)).contains(searchWord))
                    return i+1;
            }
        }
        return -1;
    }
}