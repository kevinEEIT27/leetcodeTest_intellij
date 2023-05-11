public class MaxRepeating {

	public static void main(String[] args) {
		maxRepeating("aaabaaaabaaabaaaabaaaabaaaabaaaaba", "ab");
	}

	public static int maxRepeating(String sequence, String word) {

		int c = 0;
		while (true) {
			int orgLength = sequence.length();
			sequence = sequence.replaceFirst(word, "");
			if (sequence.length() == orgLength) {
				return c;
			}
			c++;
		}
	}
}
