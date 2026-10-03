class Solution {
    public int firstUniqChar(String s) {
          int[] count = new int[26];
        
        // Step 1: Ovvoru character evlo thadava varuthu nu count pannu
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            count[c - 'a']++;
        }
        
        // Step 2: First character edhu count=1 nu check pannu
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (count[c - 'a'] == 1) {
                return i;
            }
        }
        
        return -1;
        
    }
}