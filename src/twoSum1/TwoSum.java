package twoSum1;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static int[] returnPair(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
	    for (int count = 0; count < nums.length; count++) {
	        map.put(nums[count], count);
	    }
	    for (int count = 0; count < nums.length; count++) {
	        int requiredNum = target - nums[count];
	        if (map.containsKey(requiredNum) && map.get(requiredNum) != count) {
	            return new int[] { count, map.get(requiredNum) };
	        }
	    }
	    throw new IllegalArgumentException("Error!");
    }
	
	public static void main(String[] args) {
		int[] nums = new int[]{0,3,0,3};
		int[] resultPair = returnPair(nums, 6);
		
		if(resultPair != null)
			for( int number: resultPair)
				System.out.println(number);
	}
}