package BasicRecursion;

public class PrintNTo1UsingRecursion {

	public static void printNto1(int n) {
		// TODO Auto-generated method stub

        if (n == 0) return;

        System.out.println(n);

        printNto1(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        printNto1(n);
    }
}
