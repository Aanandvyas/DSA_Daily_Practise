package SlidingWindow;

import java.util.HashMap;

import LinkedList.SinglyLL.LeetCode.checkCycle;

public class PermutationOfString {
    public static boolean checkInclusion(String s1,String s2){
        if(s1.length()>s2.length()) return false;
        HashMap<Character,Integer> s1Count = new HashMap<>();
        HashMap<Character,Integer> s2Count = new HashMap<>();

        for(int i=0;i<s1.length();i++){
            char c=s1.charAt(i);
            s1Count.put(c, s1Count.getOrDefault(c, 0)+1);

            char p=s2.charAt(i);
            s2Count.put(p, s2Count.getOrDefault(p, 0)+1);
        }
        
        if(s1Count.equals(s2Count)){
            return true;
        }

        int i=0;
        for(int j=s1.length();j<s2.length();j++){
            char c = s2.charAt(j);
            s2Count.put(c, s2Count.getOrDefault(c, 0)+1);
            
            char p = s2.charAt(i);
            s2Count.put(p, s2Count.getOrDefault(p, 0)-1);
            if(s2Count.get(p)==0) s2Count.remove(p);

            if(s1Count.equals(s2Count)){
                return true;
            }
            i++;
        }
        return false;
    }
    public static void main(String[] args){
        String s1 ="adc";
        String s2 ="dcda";
        boolean res = checkInclusion(s1,s2);

        System.out.println(res);
    }

}
