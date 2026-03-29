package BasicRecursion;

public class Print1ToNUsingRecursion {
	public static void print1ToN(int n) {
		// TODO Auto-generated method stub

        if (n == 0) return;

        print1ToN(n - 1);
        
        System.out.println(n);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 5;
        print1ToN(n);
	}

}
