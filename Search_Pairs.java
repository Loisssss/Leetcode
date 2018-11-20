    // Complete the pairs function below.
    static int pairs(int k, int[] arr) {
        int count = 0; 
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i] + k)) {
                count++;
            }
        }
        return count;
    }
