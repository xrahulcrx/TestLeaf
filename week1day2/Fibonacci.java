public class Fibonacci {

	public static int FibonacciSeries(int n) {
		// TODO Auto-generated method stub

		if (n <= 1)
			return n;

		int a = 0;
		int b = 1;

		for (int i = 0; i < n; i++) {
			

			int sum = a + b;
			a = b;
			b = sum;

		}

		return b;

	}

	public static void main(String[] args) {
		
		int n = 8;

		System.out.println("Fibonacci series up to "+n+"th term:");
		for (int i = 0; i <= n; i++) {
			System.out.print(FibonacciSeries(i) + " ");
		}
	}

}
