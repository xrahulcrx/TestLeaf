package week4day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindMissElement {
	
	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 4, 10, 6,8};
		
		
		List<Integer> arr = new ArrayList<Integer>();
		
		List<Integer> miss = new ArrayList<Integer>();
		
		
		for (int each : nums) {
			arr.add(each);
			
		}
		
		//array sort
		Collections.sort(arr);
		
		System.out.println(arr);
		
		
		//initial difference
		int diff = arr.get(1) - arr.get(0);		
		
		
		for(int i = 0; i < arr.size() - 1; i++) {
			int current = arr.get(i);
			int next = arr.get(i + 1);
			
			while((current + diff) < next) {
				current += diff;
				miss.add(current);
			}
		}
		
		System.out.println("Missing number list: "+miss);
		
		
	}

}
