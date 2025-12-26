package SlidingWindow;

import java.util.HashSet;


public class LongestString {
    public static void main(String[] args){
        String s = "qrsvbspk";
        int n = s.length();
        HashSet<Character> set = new HashSet<>();
        int l=0;
        int maxLen =0;
        for(int i=0;i<n;i++){
            while(set.contains(s.charAt(i))){
                set.remove(s.charAt(l));
                l++;
            }
            set.add(s.charAt(i));
            maxLen = Math.max(maxLen,set.size());
        }
        System.out.println(maxLen);
    }
}
