    static long substrCount(int n, String s) {
        int count = 0;
        if (s.charAt(0) == s.charAt(1)) {
            count++;
        }
        for (int i = 1; i < n-1; i++) {
            for (int j = 0; j < i; j++) {
                if (s.charAt(i) == s.charAt(i + 1)) {
                    count++;
                }
                if ((i + j + 1 < n) && (s.charAt(i-j-1) == s.charAt(i+j+1))) {
                    count++;
                } else {
                    break;
                }
            }
        }
        return count+n;
    }
