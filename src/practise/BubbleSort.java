package practise;

import java.util.ArrayList;

public class BubbleSort {
	public static ArrayList<Integer> sort(ArrayList<Integer> arr,int n) {
		for(int i=n-1;i>=0;i--) {
			int didSwap = 0;
			for(int j =0; j<=i-1;j++) {
				if(arr.get(j)>arr.get(j+1)) {
					int temp = arr.get(j);
					arr.set(j, arr.get(j+1));
					arr.set(j+1, temp);
					didSwap =1;
				}
			}
			if(didSwap==0) {
				break;
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(13);
		arr.add(46);
		arr.add(24);
		arr.add(52);
		arr.add(20);
		arr.add(9);
		System.out.println(sort(arr,arr.size()));
	}
}
