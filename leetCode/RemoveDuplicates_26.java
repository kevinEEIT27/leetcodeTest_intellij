package leetCode;

import java.util.ArrayList;

public class RemoveDuplicates_26 {
	public static void main(String[] args) {
		int[] ints = new int[3];
		ints[0] = 1;
		ints[1] = 1;
		ints[2] = 2;
		removeDuplicates(ints);
	}

	public static int removeDuplicates(int[] nums) {


		ArrayList<Object> nuwNums = new ArrayList<>();
		for (int num : nums) {
			if (!nuwNums.contains(num)) {
				nuwNums.add(num);
			}
		}
		return nuwNums.size();
	}
}
