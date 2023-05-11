public class plusOne {

	/**
	 * 是9就改为0，不是9就+1，最后如果全进位，则数组长度+1，且第一位元素设置为1
	 *
	 * @param digits
	 * @return
	 */
	public static int[] plusOne(int[] digits) {
		for (int i = digits.length - 1; i >= 0; i--) {
			if (digits[i] == 9) {
				digits[i] = 0;
			} else {
				digits[i] += 1;
				return digits;
			}

		}
		//如果所有位都是进位，则长度+1
		digits = new int[digits.length + 1];
		digits[0] = 1;
		return digits;
	}
}
