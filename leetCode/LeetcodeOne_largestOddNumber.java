package leetCode;

import java.util.ArrayList;

public class LeetcodeOne_largestOddNumber {
	public static void main(String[] args) {

		String num = "51161";
		System.out.println(largestOddNumber(num));
	}

	public static String largestOddNumber(String num) {
		if (Long.parseLong(num) % 2 != 0) {

			return num;
		}

		char[] chars = num.toCharArray();
		ArrayList<Long> oddNumbers = new ArrayList<>();
		for (char c : chars) {
			if (c != ' ') {
				if (Character.getNumericValue(c) % 2 != 0) {
					oddNumbers.add((long) Character.getNumericValue(c));
				}
			}
		}
		for (int i = 1; i < num.length(); i++) {
			if (Long.parseLong(num.substring(0, i)) % 2 != 0) {
				oddNumbers.add(Long.parseLong(num.substring(0, i)));
			}
		}
		Long max = null;
		for (Long i : oddNumbers) {
			if (max == null) max = i;
			else max = max > i ? max : i;
		}
		return max == null ? "" : max.toString();
	}
}
