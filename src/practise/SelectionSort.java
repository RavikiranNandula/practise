package practise;

import java.util.ArrayList;

public class SelectionSort {
	public static ArrayList<Integer> sort(ArrayList<Integer> arr) {
		for(int i=0;i<arr.size()-1;i++) {
			int min = i;
			for(int j =i; j<arr.size();j++ ) {
				if(arr.get(min)>arr.get(j)) {
					min = j;
				}
			}
				swap(arr,i,min);
		}
		return arr;
	}
	public static ArrayList<Integer> swap(ArrayList<Integer> arr,int i, int min){
		int temp = arr.get(i);
		arr.set(i, arr.get(min));
		arr.set(min, temp);
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
		System.out.println(sort(arr));
	}

}
