    static void checkMagazine(String[] magazine, String[] note) {
        String flag = "Yes";
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < magazine.length; i++) {
            if (!map.containsKey(magazine[i])) {
                map.put(magazine[i], 1);
            } else {
                int value = map.get(magazine[i]);
                value++;
                map.put(magazine[i], value);
            }
        }
        for (int i = 0; i < note.length; i++) {
            if (!map.containsKey(note[i])) {
                flag = "No";
            } else {
                int value = map.get(note[i]);
                value--;
                if (value < 0) {
                    flag = "No";
                } else {
                    map.put(note[i], value);
                }
            }
        }
        System.out.println(flag);
    }
