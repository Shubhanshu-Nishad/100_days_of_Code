
public class Day4SearchinRotatedSortedArrayII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public boolean search(int[] nums, int target) {
        int j=nums.length-1;
       for(int i=0;i<=nums.length/2;i++){
           if(nums[i]==target) return true;
           else if(nums[j]==target) return true;
           j--;
       }
        return false;
    }

}
