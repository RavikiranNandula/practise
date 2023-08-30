package practise;

public class MultiplyRecursion {
	public static int function(int n) {
		if(n<1) {
			return 1;
		}
		return n*function(n-1);
	}
	public static int sumFunction(int n) {
		if(n==1) {
			return 1;
		}
		return n+sumFunction(n-1);
	}
	public static void main(String args[]) {
		int n =3;
		System.out.println(function(n));
		System.out.println(sumFunction(n));
	}
}
