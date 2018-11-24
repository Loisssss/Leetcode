
    static int minimumAbsoluteDifference(int[] arr) {

        Arrays.sort(arr);
        int maxValue = Integer.MAX_VALUE; 
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if (Math.abs(arr[i+1] - arr[i]) <= maxValue) {
                maxValue = Math.abs(arr[i+1] - arr[i]);
            }
        }
        return maxValue;
    }
