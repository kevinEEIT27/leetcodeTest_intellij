package leetCode;

public class IsPalindrome_125 {

	public static void main(String[] args) {

	}

	public static Boolean isPalindrome(String s) {

		if (s.isEmpty()) return true;

		StringBuffer sb = new StringBuffer();
		char[] chars = s.toCharArray();
		for (char aChar : chars) {

			if (Character.isLetterOrDigit(aChar)) {
				sb.append(aChar);
			}
		}

		StringBuffer sgood_rev = new StringBuffer(sb).reverse();
		return sb.toString().equals(sgood_rev.toString());
	}

	/**
	 * 雙指針寫法
	 *
	 * @param s
	 * @return
	 */
	public boolean isPalindrome2(String s) {
		int n = s.length();
		int left = 0, right = n - 1;
		while (left < right) {
			while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
				++left;
			}
			while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
				--right;
			}
			if (left < right) {
				if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
					return false;
				}
				++left;
				--right;
			}
		}
		return true;

	}
}
