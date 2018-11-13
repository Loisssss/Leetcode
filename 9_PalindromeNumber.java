
class Q9 {
    public boolean isPalindrome(int x) {
        boolean flag = true;
        String str = String.valueOf(x);
        if (x < 0) {
            flag = false;
        }else if (x > 0) {
            for (int i = 0; i < str.length() / 2; i++) {
                if (str.charAt(i) != str.charAt(str.length() - i -1)) {
                    flag = false;
                }
            }  
        }else {
            flag = true;
        } 
        return flag;
    }
    public static void main(String []args) {
        Q9 solu = new Q9(); 
        boolean result = solu.isPalindrome(-12521);
        System.out.println(result);
    } 
