
public class Day3SearchinRotatedSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int search(int[] nums, int target) {
		
		        int j=nums.length-1;
		
		       for(int i=0;i<=nums.length/2;i++){
		
		           if(nums[i]==target) return i;
		
		           else if(nums[j]==target) return j;
		
		           j--;
		
		       }
		
		        return -1;
		
		    }

}
