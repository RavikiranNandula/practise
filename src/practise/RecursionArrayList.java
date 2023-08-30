package practise;

import java.util.Arrays;
import java.util.List;

public class RecursionArrayList {
	public static int[] function(int l ,int [] n){
		int length = n.length-1;
		if(l>length/2) {
			return n;
		}
        int t = n[l];
        n[l] = n[length-l];
        n[length-l] = t;
        return function(l+1,n);
    }
    public static void main(String[] args) {
        int arr[]
                = { 1, 2, 3, 8, 5, 6, 7, 11, 9, 10 };
        
            // print the original array
            System.out.println("Initial Array:\n"
                               + Arrays.toString(arr));
        int arr2[] = function(0,arr);
     // print the original array
        System.out.println("Initial Array:\n"
                           + Arrays.toString(arr2));
    }

}
