package practise;

public class fibnocciRecusrion {
	public static int function(int n) {
		if(n<=1) {
			return n;
		}
		int last = function(n-1);
		int slast = function(n-2);
		return last + slast;
	}
	public static void main(String args[]) {
		int n =5;
		System.out.println(function(n));
	}
}
