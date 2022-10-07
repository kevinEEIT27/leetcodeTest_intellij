package leetCode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	public static void main(String[] args) {
		int[] nums = new int[3];
		nums[0] = 3;
		nums[1] = 2;
		nums[2] = 3;
		twoSum2(nums, 6);

	}

	/**
	 * 自己解
	 *
	 * @param nums   數組
	 * @param target 目標數
	 * @return 符合相加的index [0,1 ]
	 */
	public static int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];
		for (int i = nums.length - 1; i >= 1; i--) {
			for (int j = 0; j < i; j++) {
				int num = nums[i] + nums[j];
				if (num == target) {
					result[0] = j;
					result[1] = i;

					break;
				}
			}
		}

		return result;
	}

	/**
	 * 最佳解
	 * 判斷 map 中 有無 目標數 減去 被選中的數,
	 * 如果沒有 把數字 當作key 其 index 當作value
	 * 例如 target =13  當13 -7  = 6 沒有存在map key 中 把7和 7的index 放入map
	 * 直到遇到 13 -6 =7 的時候
	 * 即可知道 其兩個的index
	 *
	 * @param nums   數組
	 * @param target 目標數
	 * @return 符合相加的index [0,1 ]
	 */
	public static int[] twoSum2(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(target - nums[i])) {
				return new int[]{map.get(target - nums[i]), i};
			}
			map.put(nums[i], i);
		}
		throw new IllegalArgumentException("No two sum solution");
	}

}
