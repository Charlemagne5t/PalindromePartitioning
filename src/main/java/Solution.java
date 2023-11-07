import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();

        backtrack(s, 0, "", result, new ArrayList<>());

        return result;
    }

    private void backtrack(String s, int i, String currentSubstring, List<List<String>> result, List<String> currentList){
        if(i == s.length()){
            if(currentSubstring.isEmpty()){
                result.add(new ArrayList<>(currentList));
            }
            return;
        }

        currentSubstring = currentSubstring + s.charAt(i);
        if(isPalindrome(currentSubstring)){
            currentList.add(currentSubstring);
            backtrack(s, i + 1, "", result, currentList );
            currentList.remove(currentList.size() - 1);
        }
        backtrack(s, i + 1, currentSubstring, result, currentList);


    }
    private boolean isPalindrome(String string){
        for (int i = 0; i < string.length() / 2; i++) {
            if(string.charAt(i) != string.charAt(string.length() - 1 - i)){
                return false;
            }
        }
        return true;
    }
}
