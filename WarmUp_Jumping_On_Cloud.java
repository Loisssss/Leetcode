    static int jumpingOnClouds(int[] c) {
        int step = 0;
        int current = 0;
        while (current < c.length) {
            if (current == c.length - 1) {
                return step;
            }
            if (current + 2 < c.length && c[current + 2] != 1) {
                current += 2;
                step++; 
            } else {
                current += 1;
                step++; 
            }
        }
        return step;
    }
