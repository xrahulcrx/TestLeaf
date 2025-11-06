package week4day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLarge {
	
	public static void main(String[] args) {
		
		//array
		int[] nums = {3, 2, 11, 4, 6, 7};
		
		//list interface
		List<Integer> arr = new ArrayList<Integer>();
		
		//add elements to list interface
		for (int ele : nums) {
			
			arr.add(ele);
			
		}
		
		//sort
		Collections.sort(arr);
		
		System.out.println(arr);
		
		//second largest
		System.out.println(arr.get(arr.size() - 2));
				
		
	}
 
}
