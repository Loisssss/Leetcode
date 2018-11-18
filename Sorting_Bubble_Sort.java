    // Complete the countSwaps function below.
    static void countSwaps(int[] a) {
        int length = a.length;
        int swap = 0;
        int tmp;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - 1; j++) {
                if (a[j] > a[j+1]) {
                    swap++;
                    tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                }
            }
        }
        System.out.println("Array is sorted in " + swap + " swaps.");
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[length-1]); 
    }
