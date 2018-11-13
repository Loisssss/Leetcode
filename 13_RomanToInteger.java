public class Q13 {
    public int romanToInt(String s) {
    	int len = s.length();
        int[] digit = new int[len];
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
        		switch (s.charAt(i)) {
				case 'I':
					digit[i] = 1;
					break;
				case 'V':
					digit[i] = 5;
					break;
				case 'X':
					digit[i] = 10;
					break;
				case 'L':
					digit[i] = 50;
					break;
				case 'C':
					digit[i] = 100;
					break;	
				case 'D':
					digit[i] = 500;
					break;
				case 'M':
					digit[i] = 1000;
					break;
				default:
					break;
				}
        	}
        for (int i = 0; i < digit.length - 1; i++) {
        	if (digit[i] >= digit [i + 1]) {
				result += digit[i];
        	}else {
        		result -= digit[i];
			}
        }
		return result + digit[digit.length - 1];   
    }
    
    public static void main(String []args) {
        Q13 solu = new Q13(); 
        int result = solu.romanToInt("MIV");
        System.out.println(result);
    }
}
