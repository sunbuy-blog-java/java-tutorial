package intersectiontwoarrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Example2 {
	public static int[] intersection(int[] nums1, int[] nums2) {
		Map<Integer, Integer> map = new HashMap<>();
		List<Integer> intersectionList = new ArrayList<>();
		for (int num : nums1) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}
		for (int num : nums2) {
			if (map.containsKey(num) && map.get(num) > 0) {
				intersectionList.add(num);
				map.put(num, map.get(num) - 1);
			}
		}
		int[] result = new int[intersectionList.size()];
		int index = 0;
		for (int num : intersectionList) {
			result[index++] = num;
		}
		return result;
	}

	public static void main(String[] args) {
		int[] nums1 = { 1, 3, 5, 7, 9, 11};
		int[] nums2 = { 1, 2, 3, 4, 5, 6, 7 };
		int[] intersection = intersection(nums1, nums2);
		System.out.println(Arrays.toString(intersection));
	}
}
