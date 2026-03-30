package BasicRecursion;

public class FactorialOfAGivenNumber {
	public int fact(int n) {
		if(n == 0 || n == 1) return 1;
		return n*fact(n-1);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FactorialOfAGivenNumber f = new FactorialOfAGivenNumber();
        System.out.println(f.fact(5)); 
	}

}
