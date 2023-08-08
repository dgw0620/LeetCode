class Solution {
    public boolean isPalindrome(String s) {
        String converted = "";
        
        for (char c : s.toLowerCase().toCharArray()) {
            if (Character.isLetterOrDigit(c)) converted += c;
        }
        
        char[] convertedArr = converted.toCharArray();
        
        for (int i = 0; i < convertedArr.length / 2; i++) {
            if (convertedArr[i] != convertedArr[convertedArr.length - i - 1]) return false;
        }
        
        return true;
    }
}