/**
 * 
 */
package io.arrays.solution;



/**
 * @author sumud
 *
 */
public class rotateArray {
	
	public static void main(String args[]) {
		int nums[]= {1,2,3,4,5,6,7};
		int l=nums.length;
		int k=3;
		k=k%l;
		reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
        for(Integer in:nums) {
        	System.out.print(in);
        }
           
       }
    public static void reverse(int nums[],int start, int end){
        
      while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
          start++;
          end--;
        }
    }
}
	
	
//}
