package Easy;

import java.util.ArrayList;
import java.util.Arrays;

public class CheckIfTheArrayIsSortedII {

	public boolean isSorted(ArrayList<Integer> nums) {

        for (int i = 0; i < nums.size() - 1; i++) {
            if (nums.get(i) > nums.get(i + 1)) {
                return false;
            }
        }

        return true;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

		 CheckIfTheArrayIsSortedII obj = new CheckIfTheArrayIsSortedII();
	        System.out.println(obj.isSorted(nums));
	}

}
