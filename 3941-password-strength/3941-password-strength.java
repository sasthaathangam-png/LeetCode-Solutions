class Solution {
    public int passwordStrength(String password) {
         Set<Character> uniqueChars = new HashSet<>();
        
        for (char c : password.toCharArray()) {
            uniqueChars.add(c);
        }
           int strength = 0;
        
        for (char c: uniqueChars) {
            if (c >= 'a' && c <= 'z') {
                strength += 1;
            } else if (c >= 'A' && c <= 'Z') {
                strength += 2;
            } else if (c >= '0' && c <= '9') {
                strength += 3;
            } else if ("!@#$".indexOf(c) != -1) {
                strength += 5;
            }
        }
        
        return strength;
    }
}