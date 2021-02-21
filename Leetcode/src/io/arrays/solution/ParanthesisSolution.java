package io.arrays.solution;

import java.util.*;

public class ParanthesisSolution {
    public static void main(String[] args) {
        // System.out.println(isValid("(){}}{"));
        System.out.println(isValid("(]"));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();

        for (int i=0;i<s.length();i++){

            if(s.charAt(i)=='(' || s.charAt(i)=='{'|| s.charAt(i)=='['){
                stack.push(s.charAt(i));
            }else{
                if(stack.isEmpty()){
                    return false;
                }else{
                    Character ch=stack.pop();
                    if((s.charAt(i)==')'  && ch!= '(')|| (s.charAt(i)=='}'  && ch!='{')|| (s.charAt(i)=='[' && ch!=']')){
                        return false;
                    }

                }
            }

        }
        return stack.isEmpty();
    }
}
