package practise;
import java.util.*;
public class SumOfElementsRecursion {
	public static Boolean function(int i,ArrayList<Integer> list,ArrayList<Integer> newList, int sum,int k,int n){
		if(i == n) {
			if(sum == k) {
				System.out.print(newList);
				return true;
			}
			return false;
		}
		newList.add(list.get(i));
		sum = sum+list.get(i);
		if(function(i+1,list,newList,sum,k,n)== true) {
			return true;
		}
		newList.remove(list.get(i));
		sum =sum-list.get(i);
		if(function(i+1,list,newList,sum,k,n)==true) {
			return true;
		}
		return false;
	}
	
	public static int functionCount(int i,ArrayList<Integer> list,ArrayList<Integer> newList, int sum,int k,int n){
		if(i == n) {
			if(sum == k) {
				return 1;
			}
			return 0;
		}
		newList.add(list.get(i));
		sum = sum+list.get(i);
		int l= functionCount(i+1,list,newList,sum,k,n);
		newList.remove(list.get(i));
		sum =sum-list.get(i);
		int r= functionCount(i+1,list,newList,sum,k,n);
		return l+r;
	}
	
	public static void functionArray(int i,ArrayList<Integer> list,ArrayList<Integer> newList, int sum,int k,int n){
		if(i == n) {
			if(sum == k) {
				System.out.print(newList);
				return;
			}
			return;
		}
		newList.add(list.get(i));
		sum = sum+list.get(i);
		functionArray(i+1,list,newList,sum,k,n);
		newList.remove(list.get(i));
		sum =sum-list.get(i);
		functionArray(i+1,list,newList,sum,k,n);
	}

	public static void main(String args[]) {
		int k =3;
		ArrayList<Integer> myNumbers = new ArrayList<Integer>();
	    myNumbers.add(3);
	    myNumbers.add(1);
	    myNumbers.add(1);
	    myNumbers.add(1);
	    myNumbers.add(2);
	    functionArray(0,myNumbers,new ArrayList<Integer>(),0,k,myNumbers.size());
	    //int count =functionCount(0,myNumbers,new ArrayList<Integer>(),0,k,myNumbers.size());
	    //System.out.print(count);
	}

}
