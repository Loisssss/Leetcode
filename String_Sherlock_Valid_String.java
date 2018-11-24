	// Complete the isValid function below.
	static String isValid(String s) {

		String flag = "NO";
		HashMap<Character, Integer> map = new HashMap<>();
		int newValue;
		for (int i = 0; i < s.length(); i++) {
			if (!map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), 1);
			} else {
				newValue = map.get(s.charAt(i)) + 1;
				map.put(s.charAt(i), newValue);
			}
		}

		int count = 0;
		int num1 = 0;
		int num2 = 0;
		HashMap<Integer, Integer> map2 = new HashMap<>();
		for (Character digit : map.keySet()) {
			if (!map2.containsKey(map.get(digit))) {
				map2.put(map.get(digit), 1);
			} else {
				newValue = map.get(digit) + 1;
				map2.put(map.get(digit), newValue);
			}
		}

		if (map2.size() == 1) {
			flag = "YES";
		}
		if (map2.size() == 2) {
			for (Integer num : map2.keySet()) {
				num1 = map2.get(num);
				count++;
				if (count == 1) {
					num2 = map2.get(num);
					if (Math.abs(num1 - num2) == 1 || num2 - 1 == 0 || num1 - 1 == 0) {
						flag = "YES";
					}
				}
			}
		}

		return flag;
	}
