import java.util.*;

class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<String, Integer> map = new HashMap<>();
        
        for (String i : s.split("")) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        
        for (String i : t.split("")) {
            if (!map.containsKey(i) || map.get(i) == 0) {
                return false;
            } else {
                map.put(i, map.get(i) - 1);
            }
        }
        
        for (String key : map.keySet()) {
            if (map.get(key) != 0) return false;
        }
        
        return true;
    }
}