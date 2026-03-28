package BasicMath;

public class PrimeNumber {
	 public boolean isPrime(int n) {
		 
		 if(n <= 1) return false;
		 
		 for(int i = 2; i <= Math.sqrt(n);i++) {
			 if(n % i == 0) {
				 return false;
			 }
		 }
		 System.out.println();
		 return true;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 PrimeNumber obj = new PrimeNumber();

	        System.out.println(obj.isPrime(5));  
	        System.out.println(obj.isPrime(8));  

	}

}
