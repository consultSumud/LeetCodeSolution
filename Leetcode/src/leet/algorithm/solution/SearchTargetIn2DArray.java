package leet.algorithm.solution;

public class SearchTargetIn2DArray {

    public static void main(String[] args) {
        int [][]matrix={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target=34;
        boolean result=searchMatrix(matrix,target);
        System.out.println(result);
    }

    private static boolean searchMatrix(int[][] matrix, int target) {
        boolean flag=false;
        int numofRows=matrix.length;
        int numOfCols=matrix[0].length;
        for(int i=0;i<numofRows*numOfCols;i++){
            int row=i/numOfCols;
            int col=i%numOfCols;
            if(target==matrix[row][col]){
                flag=true;
                break;
            }else{
                flag=false;
            }

        }
        return flag;

    }

}
