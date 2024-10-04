import java.util.ArrayList;
import java.util.List;
class Solution {
    String keyboard[] = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return ans;
        }
        generate(digits, 0, "", ans);
        return ans;
    }
    private void generate(String digits, int index, String current, List<String> ans) {
        if (index == digits.length()) {
            ans.add(current);
            return;
        }
        String key = keyboard[digits.charAt(index) - '0'];
        for (int i = 0; i < key.length(); i++) {
            generate(digits, index + 1, current + key.charAt(i), ans);
        }
    }
}
