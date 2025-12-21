package ArraysAndHashing.Leetcode;

public class validPalinrome2 {
    public static boolean isPalindrome(String s,int l,int r){
        while(l<r){
            if(s.charAt(l) != s.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
    public static boolean validPalindrome(String s){
        int l =0;
        int r = s.length()-1;
        while(l<r){
            if(s.charAt(l) != s.charAt(r)){
                return isPalindrome(s,l+1,r) || isPalindrome(s,l,r-1);
            }
            l++;
            r--;
        }
        return true;
    } 
    public static void main(String[] args){
        String s = "namans";
        System.out.println(validPalindrome(s));
    }
}
