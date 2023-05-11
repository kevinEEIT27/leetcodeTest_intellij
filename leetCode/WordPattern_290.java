package leetCode;

import java.util.HashMap;

public class WordPattern_290 {

	public static void main(String[] args) {
		System.out.println(wordPattern("abba", "dog cat cat pig"));
	}

	public static boolean wordPattern(String pattern, String s) {

		String[] sp = s.split(" ");
		HashMap<String, Character> map = new HashMap<>();
		HashMap<Character, String> map2 = new HashMap<>();
		if (sp.length != pattern.length()) return false;
		for (int i = 0; i < sp.length; i++) {
			String s1 = sp[i];
			if (map.containsKey(s1)) {
				Character character = map.get(s1);
				if (character != pattern.charAt(i)) return false;
			} else {
				map.put(s1, pattern.charAt(i));
			}
			if (map2.containsKey(pattern.charAt(i))) {

				if (!map2.get(pattern.charAt(i)).equals(s1)) return false;
			} else {
				map2.put(pattern.charAt(i), s1);
			}
		}
		return true;
	}
}
