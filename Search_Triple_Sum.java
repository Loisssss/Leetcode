    static long triplets(int[] a, int[] b, int[] c) {
        long result = 0;
        List<Integer> listb = new ArrayList<>();
        for (int i = 0; i < b.length; i++) {
            if (!listb.contains(b[i])) {
                listb.add(b[i]);
            }
        }
        for (int i = 0; i < listb.size(); i++) {
            int counta = 0;
            int countc = 0;

            for (int j = 0; j < a.length; j++) {
                if (a[j] <= b[i]) {
                    counta++;
                }
            }

            for (int j = 0; j < c.length; j++) {
                if (c[j] <= b[i]) {
                    countc++;
                }
            }
            result += counta * countc;
        }
        return result;
    }  
