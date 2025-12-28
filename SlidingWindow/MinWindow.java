package SlidingWindow;

import java.util.HashMap;

public class MinWindow {
    public static String minWindowSub(String s,String t){
        HashMap<Character,Integer> tMap = new HashMap<>();
        HashMap<Character,Integer> sMap = new HashMap<>();
        int tsize = t.length();
        int ssize = s.length();
        
        for(char c : t.toCharArray()){
            tMap.put(c, tMap.getOrDefault(c, 0)+1);
        }
        int have = tMap.size();
        int need =0;
        int l=0;
        int r =0;
        System.out.println(have);
        return s;
        
    }
    public static void main(String[] args){
        String s= "ADOBECODEBANC";
        String t = "ABC";

        System.out.println(minWindowSub(s,t));
    }
}
