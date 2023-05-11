package leetCode;

import java.util.HashSet;

public class RemoveDuplicates_26 {
	public static void main(String[] args) {
		int[] ints = new int[3];
		ints[0] = 1;
		ints[1] = 1;
		ints[2] = 2;
		removeDuplicates2(ints);
	}

	public static int removeDuplicates(int[] nums) {

		int c = 0;
		HashSet<Object> nuwNums = new HashSet<>();

		for (int num : nums) {
			if (!nuwNums.contains(num)) {
				nuwNums.add(num);
				nums[c] = num;
				c++;
			}
		}
		return nuwNums.size();
	}

	/**
	 * 官方佳解
	 *
	 * @param nums
	 * @return
	 */
	public static int removeDuplicates2(int[] nums) {
		int i = 0, j = 1;
		while (j < nums.length) {
			if (nums[i] == nums[j]) {
				j++;
			} else {
				nums[++i] = nums[j];
			}
		}
		return i + 1;

	}
}
