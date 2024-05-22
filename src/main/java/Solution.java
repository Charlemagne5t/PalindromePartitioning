import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        int n = s.length();
        dfs(s,res , new ArrayList<>(), "", 0);
        return res;
    }

    void dfs(String s, List<List<String>> res, List<String> curSet, String curString, int i) {
        if(i == s.length()) {
            if(curString.isEmpty()) {
                res.add(new ArrayList<>(curSet));
            }
            return;
        }
        curString += s.charAt(i);
        if(isPal(curString)) {
            curSet.add(curString);
            dfs(s, res, curSet, "", i + 1);
            curSet.remove(curSet.size() - 1);
        }
        dfs(s, res, curSet, curString, i + 1);
    }

    boolean isPal(String s) {
        int n = s.length();
        if(n % 2 == 0) {
            int r = n / 2;
            int l = r - 1;
            while(l >= 0 && r < n) {
                if(s.charAt(l) != s.charAt(r)){
                    return false;
                }
                l--;
                r++;
            }
        }else {
            int r = n / 2 + 1;
            int l = n / 2 - 1;
            while(l >= 0 && r < n) {
                if(s.charAt(l) != s.charAt(r)){
                    return false;
                }
                l--;
                r++;
            }
        }
        return true;
    }
}


