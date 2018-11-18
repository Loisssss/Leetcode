    static int countingValleys(int n, String s) {

        int count = 0;
        int valley = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {

            if (chars[i] == 'U') {
                count = count + 1;            
            } 
            if (chars[i] == 'D') {
                count = count - 1;
            }
            if (count == 0 && chars[i] == 'U') {
                valley++;
            }
        }

        return valley;
    }
