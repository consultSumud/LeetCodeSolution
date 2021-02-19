package io.arrays.solution;

public class RunningSum1DArray {
    public static void main(String[] args) {
        int []nums = {1,2,3,4};
        int [] resultArr=RunningSum(nums);
        for(Integer in:resultArr){
            System.out.println(in);
        }
    }

    private static int[] RunningSum(int [] arr) {
        int sum=0;
        int [] rsArray=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            rsArray[i]=sum+=arr[i];
        }
        return rsArray;
    }
}

