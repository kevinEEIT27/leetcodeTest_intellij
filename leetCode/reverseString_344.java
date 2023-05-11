package leetCode;

public class reverseString_344 {

	public static void main(String[] args) {
		char[] a = new char[4];
		a[0] = 'a';
		a[1] = 'b';
		a[2] = 'c';
		a[3] = 'd';

		reverseString(a);
		System.out.println(a);
	}

	public static void reverseString(char[] s) {
		int size = s.length;
		for (int i = 0; i < size / 2; i++) {
			char tmp = s[i];
			char c = s[size - 1 - i];
			s[i] = c;
			s[size - 1 - i] = tmp;
		}

	}
}
