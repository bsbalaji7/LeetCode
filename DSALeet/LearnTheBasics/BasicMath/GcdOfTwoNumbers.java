package BasicMath;

public class GcdOfTwoNumbers {
	 public int gcd(int n1, int n2) {
		 
		 while(n2!=0) {
			 int temp = n2;
			 n2 = n1 % n2;
			 n1 = temp;
		 }
		 
		 return n1;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GcdOfTwoNumbers gcd2 = new GcdOfTwoNumbers();
		int result = gcd2.gcd(8, 16);
		System.out.println(result);
	}

}
