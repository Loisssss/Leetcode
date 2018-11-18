    // Complete the maximumToys function below.
    static int maximumToys(int[] prices, int k) {

        int length = prices.length;
        int i, j;
        for (i= 1; i < length; i++) {
            int tmp = prices[i];
            for (j = i - 1; j >= 0; j--) {
                if (tmp < prices[j]) {
                    prices[j+1] = prices[j];
                } else {
                    break;
                }
            }
            prices[j+1] = tmp;
        }
        
        int value = 0;
        int count = 0;
        for (int e = 0; e < prices.length; e++) {
            if (value + prices[e] <= k) {
                value = value + prices[e];
                count++;
            } else {
                break;
            }
        }
        return count;
    }
