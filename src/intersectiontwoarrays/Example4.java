package intersectiontwoarrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Example4 {
	public static int[] intersection(int[] nums1, int[] nums2) {
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		Set<Integer> intersectionSet = new HashSet<>();
		int i = 0;
		int j = 0;
		while (i < 0 || j < nums2.length) {
			if (i < nums1.length && j < nums2.length && nums1[i] == nums2[j]) {
				intersectionSet.add(nums1[i]);
				i++;
				j++;
			} else if (i < nums1.length && (j == nums2.length || nums1[i] < nums2[j])) {
				i++;
			} else {
				j++;
			}
		}
		int[] result = new int[intersectionSet.size()];
		int index = 0;
		for (int num : intersectionSet) {
			result[index++] = num;
		}

		return result;
	}
	public static void main(String[] args) {
		int[] nums1 = { 1, 3, 5, 7, 9, 11 };
		int[] nums2 = { 1, 2, 3, 4, 5, 6, 7 };
		int[] intersection = intersection(nums1, nums2);
		System.out.println(Arrays.toString(intersection));
	}
}
