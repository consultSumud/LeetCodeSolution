package io.arrays.solution;
import java.util.HashMap;
import java.util.Map;
/**
 * 
 * To find the two numbers in a given array whose sum is equals to given value of K
 * 
 * @author sumshriv0
 *
 */
public class Findsum {

	public static void main(String[] args) {

		int[] numArray = { 2, 7, 11, 15 };
		int target=9;
		
		
		int arr[]=findTheDelta(numArray,target);
		
		for(Integer a:arr) {
			System.out.println(a);
		}
}

	private static int[] findTheDelta(int[] numArray, int target) {
		
		Map<Integer,Integer>visitedNumber=new HashMap<Integer,Integer>();
		
		for(int i=0;i<numArray.length;i++) {
			int delta=target-numArray[i];
			
			if(visitedNumber.containsKey(delta)) {
				return new int[] {visitedNumber.get(delta),i};
				
			}
			visitedNumber.put(numArray[i],i);
			
		}
		
		return new int[] {-1,-1};
		
		
		
	}
}