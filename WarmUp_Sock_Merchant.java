    static int sockMerchant(int n, int[] ar) {
        int pair = 0;
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < n; i++) {
            if (!hs.contains(ar[i])) {
                hs.add(ar[i]);
            } else {
                hs.remove(ar[i]);
                pair++;
            }
        }
        return pair;
    }
