package practise;

public class ArmStrong {
    public static void main(String args[]) {
    	int n = 1634;
    	int temp = n;
    	int sum = 0;
    	while(temp >0) {
    		int ld = temp%10;
    		sum = sum +(ld*ld*ld*ld);
    		System.out.println(sum);
    		temp = temp/10;
    	}
//    	System.out.print(sum);
    	System.out.print(sum==n);
    }
    
}
