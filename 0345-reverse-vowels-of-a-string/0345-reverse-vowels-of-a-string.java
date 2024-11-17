class Solution {
    public String reverseVowels(String s) {
        int n=s.length();
        if(s==null || s.length()==0)
            return s;
        char chars[]=s.toCharArray();
        int left=0;
        int right=n-1;
        while(left<right)
        {
            while(left<right && !isVowel(chars[left]))
                left++;
            while(left<right && !isVowel(chars[right]))
                right--;
            if(left<right)
            {
                char temp=chars[left];
                chars[left]=chars[right];
                chars[right]=temp;
                left++;
                right--;
            }            
        }
        return new String(chars);
    }
    private static boolean isVowel(char c) {
        return "AEIOUaeiou".indexOf(c) != -1;
    }
}