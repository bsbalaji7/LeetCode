package Easy;

public class LeftRotateArrayByOne {
	public void rotateLeft(int[] nums) {
		if(nums.length == 0) return;
		
		int first = nums[0];
		for(int i = 0; i < nums.length - 1; i++) {
			nums[i] = nums[i+1];
		}
		nums[nums.length -1] = first;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LeftRotateArrayByOne obj = new LeftRotateArrayByOne();

        int[] nums = {1, 2, 3, 4, 5};
        obj.rotateLeft(nums);

        for (int num : nums) {
            System.out.print(num + " ");
        }
	}

}
