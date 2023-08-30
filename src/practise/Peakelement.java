package practise;

public class Peakelement {
	    public int findPeakElement(int[] nums) {
	        int length = nums.length;
	        int result = 0;
	        int low = 1;
	        int high = length-2;
	        System.out.println(length);
	        if(length==1){
	            return 0;
	        }
	        if(nums[0]>nums[1]){
	            return 0;
	        }
	        if(nums[length-1]>nums[length-2]){
	            return length-1;
	        }
	        while(low<=high){
	            int mid = (low+high)/2;
	            if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]){
	                return mid;
	            }
	            else if(nums[mid]>nums[mid-1]){
	                low = mid+1;
	            }
	            else if(nums[mid]>nums[mid+1]){
	                high = mid-1;
	            }else{
	                low = mid+1;
	            }
	        }
	        return result;
	    }

}
