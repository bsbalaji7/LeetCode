package BasicRecursion;

public class FibonacciNumber {
	public static int fib(int n) {
		if (n <= 1) return n;

        int prev = 0, curr = 1;

        for (int i = 2; i <= n; i++) {
            int next = prev + curr;
            prev = curr;
            curr = next;
        }

        return curr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fib(5));
	}

}
