package practice;

import java.util.Arrays;

public class PivotEqual {
	
	public final static int SIZE = 15;

	private static void sortPivot(int[] nums, int i) {
		int start = 0; int end = nums.length; int equal = 0;
		int pivot = nums[i];
		while(equal < end) {
			if(nums[equal] < pivot) {
				swap(nums, start, equal);
				start++; equal++;
			} else if (nums[equal] == pivot){
				++equal;
			} else {
				swap(nums, equal, --end);
			}
		}
	}
	
	public static void swap(int[] nums, int A, int B) {
		int tmp = nums[A];
		nums[A] = nums[B];
		nums[B] = tmp;
	}


	private static int[] generateRandomArray(int n) {
		int[] result = new int[n];
		for(int i = 0; i < result.length; i++){
			result[i] = -10 + (int) (Math.random() * ((10 - (-10)) + 1));
		}
		return result;
	}
	
	public static void main(String[] args) {
		int[] input = generateRandomArray(SIZE);
		System.out.println(Arrays.toString(input));
		int pivot = (int) (Math.random() * 14);
		System.out.println(pivot);
		int[] nums = {-3, 6, 9, 2, -9};
		sortPivot(input, pivot);
		System.out.println(Arrays.toString(input));
	}

}
