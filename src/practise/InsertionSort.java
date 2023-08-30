package practise;

import java.util.ArrayList;

public class InsertionSort {
	
	public static ArrayList<Integer> sort(ArrayList<Integer> arr,int n) {
		for(int i=0 ;i<n;i++) {
			int j =i ;
			while(j>0 && arr.get(j-1)>arr.get(j)) {
				int temp = arr.get(j-1);
				arr.set(j-1, arr.get(j));
				arr.set(j, temp);
				j--;
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
