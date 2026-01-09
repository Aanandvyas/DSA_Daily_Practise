package SlidingWindow.Revision;

import java.util.HashMap;

public class MinWindowSubstring {
    public static String minWindow(String s,String t){
        int n=t.length();
        int needed = n;
        int count = 0;
        int start=0;
        int minLen = Integer.MAX_VALUE;
        HashMap<Character,Integer> map = new HashMap<>();
        
        for(int i=0;i<n;i++){
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0)+1);
        }

        int l=0;
        for(int r=0;r<s.length();r++){
            char c = s.charAt(r);
            if(map.containsKey(c)){
                if(map.get(c)>0){
                    count++;
                }
                map.put(c, map.get(c)-1);
            }

            while(count == needed){
                if(minLen>r-l+1){
                    minLen = r-l+1;
                    start = l;
                }
                char p = s.charAt(l);
                if(map.containsKey(p)){
                    map.put(p, map.get(p)+1);
                    if(map.get(p)>0){
                        count--;
                    }
                }
                l++;
            }
        }
        return minLen == 0?"":s.substring(start, start+minLen);
    }
    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";

        System.out.println(minWindow(s,t));
    }
}
