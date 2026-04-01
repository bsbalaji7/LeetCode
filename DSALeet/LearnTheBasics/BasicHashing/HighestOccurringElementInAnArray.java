package BasicHashing;

import java.util.*;

public class HighestOccurringElementInAnArray {
	 public static int mostFrequent(int[] nums) {
		 
		 HashMap<Integer,Integer> map = new HashMap<>();
		 
		 //Count
		 
		 for (int num:nums) {
			 map.put(num,map.getOrDefault(num, 0)+1);
		 }
		 
		 int maxFreq = 0;
		 int result = Integer.MAX_VALUE;
		 
		 for(int key : map.keySet()) {
			 int freq = map.get(key);
			 
			 if(freq>maxFreq) {
				 maxFreq = freq;
	               result = key;
			 }else if (freq == maxFreq && key < result) {
	                result = key;
	            }

		 }
		 
		 return result;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] nums = {4, 4, 5, 5, 6};
	        System.out.println(mostFrequent(nums)); 
		
	}

}
