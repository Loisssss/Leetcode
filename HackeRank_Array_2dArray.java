    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
    	int maxVal = -63;
    	int[][] arr2 = new int[4][4];
    	for (int i = 0; i < 4; i++) {
    		for (int j =0; j < 4; j++) {
    			arr2[i][j] = arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1] + 
    					arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];  
    			if (arr2[i][j] > maxVal) {
					maxVal = arr2[i][j];
			}
    		}
    	}
        return maxVal;
    }
