package Easy;

public class RemoveDuplicatesFromSortedArray {

	public int removeDuplicates(int[] nums) {
		if(nums.length == 0 ) return 0;
		
		int i = 0;//unique element
		
		for(int j = 1; j < nums.length;j++) {
			if(nums[j] != nums[i]) {
				i++;
				nums[i] = nums[j];
			}
			
		}
		return 1+i;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        RemoveDuplicatesFromSortedArray obj = new RemoveDuplicatesFromSortedArray();

		        int[] nums = {1,1,2,2,3};
		        int k = obj.removeDuplicates(nums);

		        System.out.println("Unique count: " + k);

		        for(int i = 0; i < k; i++) {
		            System.out.print(nums[i] + " ");
		        }
	}

}
