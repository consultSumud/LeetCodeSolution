package leet.algorithm.solution;

/**
 *LeetCode Easy Category
 *
 * Design a parking system for a parking lot.
 * The parking lot has three kinds of parking spaces:
 * big, medium, and small, with a fixed number of slots for each size.
 * Implement the ParkingSystem class:
 *
 * ParkingSystem(int big, int medium, int small) Initializes object of the ParkingSystem class.
 * The number of slots for each parking space are given as part of the constructor.
 * bool addCar(int carType) Checks whether there is a parking space of carType for
 * the car that wants to get into the parking lot. carType can be of three kinds: big, medium, or small,
 * which are represented by 1, 2, and 3 respectively. A car can only park in a parking space of its carType.
 * If there is no space available, return false, else park the car in that size space and return true.
 * Input ::::["ParkingSystem","addCar","addCar","addCar","addCar"]
 * [[1,1,0],[1],[2],[3],[1]]
 * output:
 *
 * [null,true,true,false,false]
 * /**
 *  * Your ParkingSystem object will be instantiated and called as such:
 *  * ParkingSystem obj = new ParkingSystem(big, medium, small);
 *  * boolean param_1 = obj.addCar(carType);
 *  */

public class ParkingLotSystem {

    int big;
    int medium;
    int small;
    public ParkingLotSystem(int big, int medium, int small) {
        this.big=big;
        this.medium=medium;
        this.small=small;
    }

    public boolean addCar(int carType) {
        boolean flag=false;


        if(carType==1){
            if(big>0){
                big=big-1;
                flag=true;
            }
        }
        else if(carType==2){
            if(medium>0){
                medium=medium-1;
                flag= true;
            }
        }
        else {
            if(carType==3){
                if(small>0){
                    small=small-1;
                    flag= true;
                }
            }
        }


        return flag;
    }


}
