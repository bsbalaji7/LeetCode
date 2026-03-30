package BasicRecursion;

public class SumofFirstNNumbers {
	public int sum(int n) {
		if(n==0) return 0;
		int result = n + sum(n - 1); 
        System.out.println(result);  

        return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SumofFirstNNumbers s = new SumofFirstNNumbers();
		s.sum(10);

	}

}
