class Q12 {
	public String intToRoman(int num) {
		String result = "";
		while (num > 0) {
			if (num - 999 >= 0) {
				if (num - 1000 >= 0) {
					num -= 1000;
					result += "M";
					continue;
				}
			}
			if (num >= 900 && num < 1000) {
				result += "CM";
				num = num - 900;
			}
			if (num / 500 > 0) {
				result += "D";
				num = num - 500;
			}
			if (num >= 400 && num < 500) {
				result += "CD";
				num = num - 400;
			}
			if (num - 99 >= 0) {
				if (num - 100 >= 0) {
					num -= 100;
					result += "C";
					continue;
				}
			}
			if (num >= 90 && num < 100) {
				result += "XC";
				num = num - 90;
			}

			if (num / 50 > 0) {
				result += "L";
				num = num - 50;
			}
			if (num >= 40 && num < 50) {
				result += "XL";
				num = num - 40;
			}
			if (num - 9 >= 0) {
				if (num - 10 >= 0) {
					num -= 10;
					result += "X";
					continue;
				}
			}
			if (num == 9) {
				result += "IX";
				num = num - 9;
			}
			if (num / 5 > 0) {
				result += "V";
				num = num - 5;
			}
			if (num == 4) {
				result += "IV";
				num = num - 4;
			}
			if (num / 1 > 0) {
				result += "I";
				num = num - 1;
			}
		}
		return result;
	}
}
