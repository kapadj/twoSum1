package twoSum1;

import java.util.HashSet;
import java.util.Hashtable;

public class TwoSum {

	public static int[] returnPair(int[] nums, int target) {
		int[] resultPair = new int[2];
		HashSet<Integer> numTable = new HashSet<Integer>();
		
		if(nums.length<2){
			System.out.println( "Need at least two numbers!");
			return(null);
		}	
		
		for(int count = 0; count< nums.length; count++) 
			numTable.add(nums[count]);
		
		for(int count = 0; count< nums.length; count++){
			int currentNum = nums[count];
			int requiredNum = target - currentNum;
			
			if(numTable.contains(requiredNum)){
				resultPair[0] = currentNum;
				resultPair[1] = requiredNum;
				return(resultPair);
			}
		}
		return(resultPair);
    }
	
	public static void main(String[] args) {
		int[] nums = new int[]{3,4,8,9,0,1};
		int[] resultPair = returnPair(nums, 7);
		
		if(resultPair != null)
			for( int number: resultPair)
				System.out.println(number);
	}
}
