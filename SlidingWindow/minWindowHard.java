package SlidingWindow;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.PriorityQueue;

public class minWindowHard {
    public static String minWindow(String s,String t){
        int l=0;
        int count=0;
        int minLen = Integer.MAX_VALUE;
        int start = -1;
        int needed = t.length();

        HashMap<Character,Integer> map = new HashMap<>();

        for(char c:t.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        for(int r=0;r<s.length();r++){
            char c = s.charAt(r);
            if(map.containsKey(c)){
                if(map.get(c)>0){
                    count++;
                }
                map.put(c, map.get(c)-1);
            }
            while(count==needed){
                if(minLen>r-l+1){
                    minLen = r-l+1;
                    start = l;
                }

                char p = s.charAt(l);
                if(map.containsKey(p)){
                    map.put(p,map.get(p)+1);
                    if(map.get(p)>0){
                        count--;
                    }
                }
                l++;
            }
        }
        return minLen == Integer.MAX_VALUE?"":s.substring(start, start+minLen);


    }
    public static void main(String[] args){
        String s = "ADOBECODEBANC";
        String t = "ABC";

        System.out.println(minWindow(s, t));

    }
}
