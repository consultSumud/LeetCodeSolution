package io.arrays.solution;

import java.util.Scanner;

public class StackWIthArray {
    int top;
    int arr[] = new int[5];

    StackWIthArray() {
        top = -1;
    }

    public static void main(String[] args) {

        int num = 10;
         StackWIthArray stackWIthArray= new StackWIthArray();
        stackWIthArray.pop();
        stackWIthArray.push(5);
        stackWIthArray.peak();
        stackWIthArray.push(10);
        stackWIthArray.push(15);
        stackWIthArray.push(20);
        stackWIthArray.push(45);
        stackWIthArray.push(9);
        stackWIthArray.pop();


    }

    public void push(int num) {

        if (top == -1 || top < arr.length - 1) {
            top++;
            arr[top] = num;
            System.out.println("item pushed into stack"+num);
        } else if (top >= arr.length-1) {
            System.out.println("Stack Overflow");
        }
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack underflow");
            return 0;
        } else {
            int itemToPop = arr[top];
            System.out.println("item to be popped"+itemToPop);
            top--;
            return itemToPop;
        }

    }

    public int peak() {
        if (top > -1 || top < arr.length - 1) {
            int x = arr[top];
            return x;
        }else

        return 0;
    }
}


