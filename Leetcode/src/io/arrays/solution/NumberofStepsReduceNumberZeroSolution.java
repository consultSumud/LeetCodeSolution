package io.arrays.solution;

public class NumberofStepsReduceNumberZeroSolution {

    public static void main(String[] args) {
        int num=24;
        int stepsCount=numberOfSteps(num);
        System.out.println(stepsCount);
    }

    public static int numberOfSteps (int num) {
        int count =0;

        while(num!=0){
            if(num%2==0){

                num=num/2;
                count++;
            }else{
                num=num-1;
                count++;
            }
        }
        return count;
    }
}
