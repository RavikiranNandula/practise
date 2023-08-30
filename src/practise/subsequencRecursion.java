package practise;

import java.util.ArrayList;

public class subsequencRecursion {
	public static void subSequences(int i, ArrayList<Integer> list, ArrayList<Integer> arr,int n) {
		if(i==n)
		{
			System.out.println(list);
			return;
		}
		list.add(arr.get(i));
		subSequences(i+1,list,arr,n);
		list.remove(arr.get(i));
		subSequences(i+1,list,arr,n);
	}
	public static void main(String args[]) {
	    ArrayList<Integer> myNumbers = new ArrayList<Integer>();
	    myNumbers.add(3);
	    myNumbers.add(1);
	    myNumbers.add(2);
	    subSequences(0,new ArrayList<Integer>(), myNumbers,myNumbers.size());
	}

}
