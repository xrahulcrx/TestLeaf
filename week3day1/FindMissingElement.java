import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		
		int[] a = {1, 4,3,2,8, 6, 7};
		
		Arrays.sort(a);
		
		int initial = a[0];
				
		for (int i = 0; i < a.length; i++) {
			if(a[i] != initial) {
				System.out.println("The missing element is "+initial);	
				break;
			}
			initial++;
		}
	}

}
