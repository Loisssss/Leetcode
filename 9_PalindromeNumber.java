class Solution {
    public boolean isPalindrome(int x) {
        boolean flag = true;
        String str = String.valueOf(x);
        if (x < 0) {
            flag = false;
        } else {
            for (int i = 0; i < str.length() / 2; i++) {
                if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                    flag = false;
                    break;
                }
            }  
        }
        return flag;
    }
} 
