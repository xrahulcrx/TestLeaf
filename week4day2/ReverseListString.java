package week4day1HA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseListString {
	
	public static void main(String[] args) {
		
		String[] company = {"HCL", "Wipro", "Aspire Systems", "CTS"};
		
		List<String> companyList = new ArrayList<>();
		
		for (String list : company) {
			
			companyList.add(list);
			
		}
		
		//list
		System.out.println("List Data : "+companyList);
		
		//sort
		Collections.sort(companyList);
		
		//reverse
		System.out.println("Reverse List");
		for(int i = companyList.size()-1 ; i >= 0; i--) {
			System.out.print(companyList.get(i));
			if(i>0) {
				System.out.print(", ");
			}
		}
		
		
	}

}
