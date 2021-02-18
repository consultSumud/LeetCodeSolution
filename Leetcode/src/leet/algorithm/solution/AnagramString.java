package leet.algorithm.solution;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class AnagramString {


    public static void main(String[] args) {
        String a="anagram";
        String b="margana";
        boolean flag=isAnagram(a,b);
        System.out.println(flag);
    }


        static boolean isAnagram(String a, String b) {

            if( a == null || b == null || a.equals("") || b.equals("") )
                throw new IllegalArgumentException();
            a=a.toLowerCase();
            b=b.toLowerCase();
            boolean flag=true;

            if(a.length()!=b.length())
                return false;
            java.util.Map<Character,Integer> map=new java.util.HashMap<Character,Integer>();
            for(int i=0;i<a.length();i++){
                if(!map.containsKey(a.charAt(i))){
                    map.put(a.charAt(i),1);
                }else{

                    map.put(a.charAt(i),map.get(a.charAt(i))+1);
                }
            }
            for (int j = 0; j < b.length(); j++) {
                Character ch = b.charAt(j);
                if (map.containsKey(ch)) {

                    map.put(ch,map.get(ch)-1);

                }else{
                    map.put(ch,-1);
                }
            }
            for (java.util.Map.Entry<Character, Integer> entry : map.entrySet()) {
                if (entry.getValue() != 0) {
                    flag = false;
                    break;
                } else {
                    flag = true;
                }





            }
            return flag;
        }



}




