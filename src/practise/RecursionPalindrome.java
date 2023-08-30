package practise;

import java.util.Arrays;

public class RecursionPalindrome {
	public static Boolean function(int i,String n){
		int length = n.length()-1;
		if(i>length/2) {
			return true;
		}
		if(n.charAt(i) != n.charAt(length-i)) {
			return false;
		}
        return function(i+1,n);
    }
    public static void main(String[] args) {
     // print the original array
        System.out.println(function(0,"MADSM"));
    }
}
