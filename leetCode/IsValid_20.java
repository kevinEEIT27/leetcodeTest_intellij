package leetCode;

public class IsValid_20 {
	public static void main(String[] args) {
		System.out.println(isValid("([])"));
	}

	public static boolean isValid(String s) {
		String a = "\\[]";
		String b = "\\{}";
		String c = "\\(\\)";
		boolean flage = Boolean.FALSE;
		s = s.replaceAll(c, "");
		s = s.replaceAll(a, "");
		s = s.replaceAll(b, "");
		while (true) {
			String orgs = s;
			s = s.replaceAll(c, "");
			s = s.replaceAll(a, "");
			s = s.replaceAll(b, "");
			if (orgs.equals(s)) {
				if (flage) break;
				flage = Boolean.TRUE;
			}
		}
		return s.isEmpty();
	}
}
