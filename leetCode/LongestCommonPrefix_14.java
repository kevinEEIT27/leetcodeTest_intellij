package leetCode;

public class LongestCommonPrefix_14 {
	public static void main(String[] args) {
		String[] strs = new String[2];
		strs[0] = "flower";
		strs[1] = "f";
//		strs[2] = "flow";
		longestCommonPrefix2(strs);
	}

	public static String longestCommonPrefix(String[] strs) {

		String result = "";
		Boolean flage = true;
		if (strs.length == 1) return strs[0];

		for (int i = 1; i <= strs[0].length(); i++) {
			String s = strs[0].substring(0, i);

			for (int j = 1; j < strs.length; j++) {
				String str = strs[j];
				if (str.length() < i) {
					flage = false;
					break;
				}
				if (!str.substring(0, i).equals(s)) {
					flage = false;
					break;
				}
			}
			if (flage) {
				result = s;
			} else return result;
		}
		return result;
	}

	public static String longestCommonPrefix2(String[] strs) {
		if (strs.length == 0)
			return "";
		String ans = strs[0];
		for (int i = 1; i < strs.length; i++) {
			int j = 0;
			for (; j < ans.length() && j < strs[i].length(); j++) {
				if (ans.charAt(j) != strs[i].charAt(j))
					break;
			}
			ans = ans.substring(0, j);
			if (ans.equals(""))
				return ans;
		}
		return ans;

	}
}
