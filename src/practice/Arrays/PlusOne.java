package practice.Arrays;

import java.util.Arrays;

public class PlusOne {
	
	public static int[] plusOne(int[] nums){
		nums[nums.length-1]++;
		for(int i = nums.length-1; i > 0 && nums[i] == 10; --i) {
			nums[i] = 0;
			++nums[i-1];
		}
		if(nums[0] == 10){
			System.out.println("here");
			nums[0] = 0;
			int[] res = new int[nums.length+1];
			res[0] = 1;
			for(int i = 1; i < res.length; i++){
				res[i] = nums[i-1]; 
			}
			return res;
		} else {
			return nums;
		}
	}

	public static void main(String[] args) {
		int[] input = new int[(int) (Math.random() * 20)];
		System.out.println(input.length);
		for(int i = 1; i < input.length; i++){
			input[i] = (int) (Math.random() * 9);
		}
		input[0] = 1 + (int)(Math.random() * 9); 
		int[] case9999 = {9, 9, 9, 9};
		System.out.println(Arrays.toString(case9999));
		int[] res = plusOne(case9999);
		System.out.println(Arrays.toString(res));
	}

}
