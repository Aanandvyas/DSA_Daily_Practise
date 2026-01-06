package Sorting.Revision;

import java.util.HashMap;

public class CharacterReplacement {
    public static int charRep(String s,int k){
        HashMap<Character,Integer> map = new HashMap<>();
        int l=0;
        int n = s.length();
        int maxFreq = 0;
        int maxLen=0;

        for(int i=0;i<n;i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
            maxFreq = Math.max(maxFreq, map.get(s.charAt(i)));
            if(i-l+1-maxFreq>k){
                map.put(s.charAt(l), map.get(s.charAt(l))-1);
                l++;
            }
            maxLen = Math.max(maxLen, i-l+1);

        }
        return maxLen;
    }
    public static void main(String[] args){
        String s = "AABABBA";
        int k =1;
        System.out.println(charRep(s, k));
    }
}
