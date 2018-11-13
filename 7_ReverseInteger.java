class Solution { 
    public int reverse(int x) { 
        boolean flag = true;
        int sum = 0;
        double max = Math.pow(2,31) -1;
        if (x < 0){
            flag = false;
            x = -x;
        }
        while(x > 0) {
            int remainder = x % 10;
            if (sum > (Math.pow(2,31) -1) / 10 ) {
                return 0;
            }
            sum *= 10;
            sum += remainder;
            x /= 10;
        }
        if (flag == false) {
            return -sum;
        }else {
            return sum;
        }
    }
    public static void main(String []args) {
        Solution solu = new Solution();
	int result = solu.reverse(1238665);
        System.out.println(result);
    }
}
