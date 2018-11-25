// Complete the primality function below.
    static String primality(int n) {
        
        String result = "Prime";
        double num = Math.sqrt(n);

        if (n < 2) {
            return "Not prime";
        } 
        if (n > 3) {
            for (int i = 2; i <= num+1; i++) {
                if (n % i == 0) {
                    return "Not prime";
                }
            } 
        } 
        return result;
    }
