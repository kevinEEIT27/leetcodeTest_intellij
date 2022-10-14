package leetCode;

public class LengthOfLastWord {

	public static void main(String[] args) {
		lengthOfLastWord("a ");
	}

	public static int lengthOfLastWord(String s) {
		s = s.trim();
		int index = s.length() - 1;
		int length = 0;
		if (index == 0) return 1;

		while (true) {

			if ((s.charAt(index) == ' ') || length == s.length()) {
				break;
			} else {
				length++;
				index--;
				if (index == -1) {
					break;
				}
			}

		}
		return length;
	}
}
