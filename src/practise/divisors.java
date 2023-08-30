package practise;

public class divisors {
	
	public static int function(int n) {
		int sum =0;
		for(int j=1;j*j<=n;j++){
          //System.out.println(j);
          if(n%j==0){
              sum =sum+j;
              if((n/j) != j){
                  sum = sum + (n/j);
              }
          }
	}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum =0;
		int n = 3;
//        for(int i =1 ;i<=n;i++){
//        	System.out.println(i);
//        	System.out.println(Math.sqrt(i));
//            for(int j=1;j*j<=i;j++){
//            //System.out.println(j);
//            if(i%j==0){
//                sum =sum+j;
//                if((i/j) != j){
//                    sum = sum + (i/j);
//                }
//            }
//        }
//        }
		int sum1 = function(n-1);
		int sum2 = function(n-2);
      System.out.println(sum1+sum2);
	}

}
