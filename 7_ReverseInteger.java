class Solution {
    
    public int a,b,c, result;
    public int reverse(int x) {
        
        c = x % 10;
        b = ((x - c) / 10) % 10;
        a = (((x - c) / 10) - b) / 10;
        
        if (c != 0) {
            result = c * 100 + b * 10 + a;
        } else if (c == 0 && b != 0) {
            result = b * 10 + a;
        } else if (c == 0 && b == 0){
            result = a;
        }
        if (x < 0) {
            return -result;
        }else {
            return result;
        } 
    }
}
