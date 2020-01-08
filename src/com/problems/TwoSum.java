package com.problems;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	
	
	public static void main(String[] args) {

        int[] nums= new int[2];
        nums[0] = 3;
        nums[1] = 3;
		int[] solu = Solution.twoSum(nums, 6);
		
		if(solu!=null) {
			for(int i = 0;i<solu.length;i++){
				System.out.println(solu[i]);
	        }
			 
			
		}
	}
	
	  

}
class Solution {
    public static int[] twoSum(int[] nums, int target) {
        
        
        Map<Integer,Integer> numbers = new HashMap<Integer,Integer>();
        int half = 0;
        int count = 0;
        if(target%2==0) {
        	half = target/2;
        }
        for(int i = 0;i<nums.length;i++){
        	
        	if(nums[i]==half) {
        		count++;
        	}
        	if(count == 2) {
        		int[] arr= new int[2];
                arr[1] = i;
                arr[0] = numbers.get(half);
                return arr;
            }
            numbers.put(nums[i],i);
        }
        
        for(int i = 0;i<nums.length;i++){
            int k = target - nums[i];
            if(k==nums[i]) {
            	continue;
            }
            if(numbers.containsKey(k)){
                int[] arr= new int[2];
                arr[0] = i;
                arr[1] = numbers.get(k);
                return arr;
            }
        }
        return null;
    }
}