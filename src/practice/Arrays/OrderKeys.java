package practice.Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrderKeys {
	
	public static enum KEY { A, B, C };
	
	public static void sortByKeys(List<KEY> input, KEY pivot) {
		int smaller = 0; int equal = 0; int larger = input.size();
		while(equal < larger) {
			if(input.get(equal).ordinal() < pivot.ordinal()){
				Collections.swap(input, smaller++, equal++);
			} else if (input.get(equal).ordinal() == pivot.ordinal()){
				++equal;
			} else {
				Collections.swap(input, equal, --larger);
			}
		}
	}
	
	public static void main(String[] args) {
		List<KEY> input = new ArrayList<KEY>();
		input.add(KEY.A); input.add(KEY.B); input.add(KEY.B); input.add(KEY.A);
		input.add(KEY.C); input.add(KEY.A); input.add(KEY.C); input.add(KEY.B);
		System.out.println(input);
		sortByKeys(input, KEY.B);
		System.out.println(input);
		
	}

}
