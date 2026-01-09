package SlidingWindow.Revision;

import java.util.HashMap;

public class PermutationStrings {
    public static boolean chechInclusion(String s1, String s2){
        if(s1.length()>s2.length()) return false;
        HashMap<Character,Integer> s1Count = new HashMap<>();
        HashMap<Character,Integer> s2Count = new HashMap<>();

        for(int i=0;i<s1.length();i++){
            s1Count.put(s1.charAt(i), s1Count.getOrDefault(s1.charAt(i), 0)+1);
            s2Count.put(s2.charAt(i), s2Count.getOrDefault(s2.charAt(i), 0)+1);
        }

        if(s1Count.equals(s2Count)) return true;
        int l=0;

        for(int j=s1.length();j<s2.length();j++){
            s2Count.put(s2.charAt(j), s2Count.getOrDefault(s2.charAt(j), 0)+1);
            s2Count.put(s2.charAt(l), s2Count.get(s2.charAt(l))-1);
            if(s2Count.get(s2.charAt(l))==0){
                s2Count.remove(s2.charAt(l));
            }
            if(s1Count.equals(s2Count)) return true;
            l++;
        }
        return false;
    }
    public static void main(String[] args){
        String s1  = "ab";
        String s2= "eidwbaqq";
        System.out.println(chechInclusion(s1,s2));
    }
}
