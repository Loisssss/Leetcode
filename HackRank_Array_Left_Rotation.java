    // Complete the rotLeft function below.
    static int[] rotLeft(int[] a, int d) {
        int length = a.length;
        int remain = d % length;
        int[] left = new int[remain];
        int[] right = new int[length - remain];
        int[] result = new int[length];

        for (int i = 0; i < remain; i++) {
            left[i] = a[i];
        }
        for (int i = 0; i < length - remain; i++) {
            right[i] = a[remain+i];
        }
        for (int  i = 0; i < length; i++) {
            if (i < length-remain) {
                result[i] = right[i];
            } else {
                result[i] = left[i-length+remain];
            }
        }
        return result;
    }
