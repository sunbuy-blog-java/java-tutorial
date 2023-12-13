package intersectiontwoarrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example5 {
	public static int[] intersection(int[] nums1, int[] nums2) {
		int max = Math.max(getMax(nums1), getMax(nums2));
		boolean[] hash = new boolean[max + 1];
		for (int num : nums1) {
			hash[num] = true;
		}
		List<Integer> intersectionList = new ArrayList<>();
		for (int num : nums2) {
			if (num <= max && hash[num]) {
				intersectionList.add(num);
				hash[num] = false;
			}
		}
		int[] result = new int[intersectionList.size()];
		int index = 0;
		for (int num : intersectionList) {
			result[index++] = num;
		}
		return result;
	}
	private static int getMax(int[] nums) {
		int max = Integer.MIN_VALUE;
		for (int num : nums) {
			max = Math.max(max, num);
		}
		return max;
	}
	public static void main(String[] args) {
		int[] nums1 = { 1, 3, 5, 7, 9, 11 };
		int[] nums2 = { 1, 2, 3, 4, 5, 6, 7 };
		int[] intersection = intersection(nums1, nums2);
		System.out.println(Arrays.toString(intersection));
	}
}
