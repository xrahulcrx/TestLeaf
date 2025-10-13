public class IsPrime {
	
	public static boolean PrimeNumber(int n) {
		
		if (n < 2) return false;
		if (n == 2) return true;
		if (n % 2 == 0) return false;
		
		
		for(int i = 3; i * i <= n; i+=2) {
			
			if(n % i == 0) return false;
		}
		
		
		return true;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 1;
		
		System.out.println(num + " is prime: "+ PrimeNumber(num));
		

	}

}
