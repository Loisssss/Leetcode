    // Complete the countTriplets function below.
    static long countTriplets(List<Long> arr, long r) {
    	HashMap<Integer, Integer> map = new HashMap<>();
    	int count = 0;
    	for (int i = 0; i < arr.size() - 2; i++) {
    		for (int j = i + 1; j < arr.size() -1; j++) {
    			for (int k = j + 1; k < arr.size(); k++) {
    				if (((double)arr.get(i) / arr.get(j) == (double)arr.get(j) / arr.get(k)) && j > i && k > j) {
    					count++;
    				}
    			}
    		}
    	}
		return count;
    }
