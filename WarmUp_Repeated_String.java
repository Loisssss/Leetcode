    static long repeatedString(String s, long n) {
        long size = s.length();
        long count1 = 0;
        long count2 = 0;
        long a = n / size;
        long result = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'a') {
                count1++;
            }
        }
        for (int i = 0; i < n % size; i++) {
            if (chars[i] == 'a') {
                count2++;
            }
        }
        result = count2 + count1 * a;
        return result;
    }
