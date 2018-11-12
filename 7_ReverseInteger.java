class Solution { 
    public int reverse(int x) { 
        int result = 0; 
        String str = String.valueOf(x); 
        for (int i = str.length()-1; i >= 0; i--) { 
            if (i == 0 && str.charAt(i) == '-') { 
                result *= -1; 
            } else if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                result = result * 10; 
                result = result + (int)str.charAt(i) - '0'; 
            } else { 
                return 0; 
            } 
        } 

        return result; 
    } 
}
            

