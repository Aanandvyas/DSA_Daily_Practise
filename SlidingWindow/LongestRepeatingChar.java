package SlidingWindow;

import java.util.HashMap;

public class LongestRepeatingChar {
    public static int longestRepeat(String s,int k){
        HashMap<Character,Integer> map = new HashMap<>();
        int i=0;
        int n = s.length();
        int maxFreq =0;
        int maxLen =1;

        for(int j=0;j<n;j++){
            char c = s.charAt(j);
            map.put(c, map.getOrDefault(c, 0)+1);
            maxFreq = Math.max(maxFreq,map.get(c));
            if(j-maxFreq+1>k){
                map.put(s.charAt(i), map.get(s.charAt(i))-1);
                i++;
            }
            maxLen = Math.max(maxLen, j-i+1);
        }
        return maxLen;
    }
    public static void main(String[] args){
        int k=1;
        String s="AABABBA";

        int res = longestRepeat(s, k);
        System.out.println(res);
    }
}
