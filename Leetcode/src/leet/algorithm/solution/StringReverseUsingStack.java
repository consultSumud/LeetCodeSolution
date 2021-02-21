package leet.algorithm.solution;

import java.util.Stack;

public class StringReverseUsingStack {
    public static void main(String[] args) {
        String str="abcdefg";
        String reverse="";

        Stack<Character> stack= new Stack<>();
        for(int i=0;i<str.length();i++){
            stack.push(str.charAt(i));
        }
        while(!stack.isEmpty())

            reverse=reverse.concat(stack.pop().toString());

        System.out.println(reverse);
        }


    }

