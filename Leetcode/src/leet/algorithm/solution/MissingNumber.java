package leet.algorithm.solution;
//using Gauss Algorithm
public class MissingNumber {

    public static void main(String[] args) {
        int[] nums = {0,1 ,3};
        usingGuessMethod(nums);
        usingArithmeticProgresion(nums);
    }

    private static void usingArithmeticProgresion(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }

    }


    private static void usingGuessMethod(int[] nums) {
        int sum=0;
       // int actualSum=nums.length*(nums.length+1)/2;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        System.out.println(nums.length*(nums.length+1)/2-sum);

    }
}
