class Solution {
    public int lengthOfLastWord(String s) {
        
          s = s.trim(); // remove leading/trailing spaces
        String[] words = s.split(" ");
        return words[words.length - 1].length();
    
    }
}