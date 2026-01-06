package Sorting.Revision;

import java.util.HashSet;

public class LongestSubstring {
    public static int longest(String s){
        int n = s.length();
        int l=0;
        HashSet<Character> set = new HashSet<>();
        int maxLen=0;
        
        for(int i=0;i<n;i++){
            while(set.contains(s.charAt(i))){
                set.remove(s.charAt(l++));
            }
            set.add(s.charAt(i));
            maxLen = Math.max(maxLen, i+1-l);
        }
        return maxLen;
    }
    public static void main(String[] args){
        String s = "pabcabcbb";
        System.out.println(longest(s));
    }
}
