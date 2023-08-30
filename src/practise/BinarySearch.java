package practise;

import java.util.ArrayList;
public class BinarySearch {
	
    public static void main(String args[]) {
    	int k =10;
    	ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(1);
        myNumbers.add(3);
        myNumbers.add(4);
        myNumbers.add(7);
        myNumbers.add(10);
        int length = myNumbers.size();
        int low = 0;
        int high = length-1;
        int mid;
        while(low<=high) {
        	mid = (low+high)/2;
        	if(myNumbers.get(mid) == k) {
        		System.out.print("Element found :".concat(String.valueOf(mid)));
        		break;
        	}
        	if(myNumbers.get(mid)<k) {
        		low = mid+1;
        	}
        	else {
        		high = mid-1;
        	}
        }
    }

}
