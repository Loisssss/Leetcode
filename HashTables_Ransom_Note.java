	// Complete the checkMagazine function below.
	static void checkMagazine(String[] magazine, String[] note) {
		boolean flag = true;
		List<String> list = new ArrayList<>();
		for (int i = 0; i < magazine.length; i++) {
			list.add(magazine[i]);
		}
		for (int i = 0; i < note.length; i++) {
			if (!list.contains(note[i])) {
				flag = false;
			} else {
				list.remove(note[i]);
			}
		}
		if (list.size() >= 0 && flag == true) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
