    // Complete the makeAnagram function below.
    static int makeAnagram(String a, String b) {

        HashMap<Character, Integer> map1 = new HashMap<>();
        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            if (!map1.containsKey(c)) {
                map1.put(c, 1);
            } else {
                map1.put(c, map1.get(c) + 1);
            }
        }

        int count = b.length();
        for (int i = 0; i < b.length(); i++) {
            if (map1.containsKey(b.charAt(i))) {
                count--;
                map1.put(b.charAt(i), map1.get(b.charAt(i))-1);
            }
        }

        int count2 = 0;
        for (Character chars : map1.keySet()) {
            if (map1.get(chars) > 0) {
                count2 += map1.get(chars);
            } else {
                count2 -= map1.get(chars);
            }
        }
        return count2 + count;
    }
