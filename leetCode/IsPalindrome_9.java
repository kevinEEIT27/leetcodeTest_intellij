package leetCode;

public class IsPalindrome_9 {
	public static void main(String[] args) {
		System.out.println(isPalindrome(-121));

	}

	/**
	 * 121 % 10 = 1 把1 存起來
	 * 121 / 10 = 12.1 存成int = 12
	 * 12 % 10 = 2 ; 把1*10 =10 10+2 =12
	 * 12 / 10 = 1.2 存成int = 1
	 * 反覆進行
	 * 直到
	 * 1 /10 剩 0 離開迴圈
	 *
	 * @param x 121
	 * @return
	 */
	public static boolean isPalindrome(int x) {
		boolean isNegativeInt = x < 0;

		if (isNegativeInt) x *= -1;

		int result = 0;
		int tmp = x;
		while (true) {
			int digit = tmp % 10;
			result = result * 10 + digit;
			tmp /= 10;
			if (tmp == 0)
				break;
		}
		if (isNegativeInt) x *= -1;
		return result == x;
	}

	/**
	 * 最佳解
	 * 如果是负数则一定不是回文数，直接返回 false
	 * 如果是正数，则将其倒序数值计算出来，然后比较和原数值是否相等
	 * 如果是回文数则相等返回 true，如果不是则不相等 false
	 * 比如 123 的倒序 321，不相等；121 的倒序 121，相等
	 *
	 * @param x 121
	 * @return boolean
	 */
	public boolean isPalindrome2(int x) {
		if (x < 0)
			return false;
		int cur = 0;
		int num = x;
		while (num != 0) {
			cur = cur * 10 + num % 10;
			num /= 10;
		}
		return cur == x;
	}
}

