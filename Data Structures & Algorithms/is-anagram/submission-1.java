class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> s_letters = new HashMap<Character, Integer>();
        char[] s_arr = s.toCharArray();
        char[] t_arr = t.toCharArray();

        if (s_arr.length != t_arr.length) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            if (!s_letters.containsKey(s_arr[i])) {
                s_letters.put(s_arr[i], 1);
            }
            else {
                s_letters.computeIfPresent(s_arr[i], (k,v) -> v + 1);
            }
        }
        
        for (int j = 0; j < t.length(); j++) {
            if (!s_letters.containsKey(t_arr[j])) {
                 return false;
            } else if (s_letters.get(t_arr[j]) >= 1) {
                s_letters.computeIfPresent(t_arr[j], (k,v) -> v - 1);
            }
            else {
                return false;
            }
        }
        return true;
    }
}
