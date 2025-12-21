package ArraysAndHashing.Leetcode;

import java.util.ArrayList;

public class isPalimdrome1 {
    public static boolean isPalindrome(String s) {
        String cleanS = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        ArrayList<Character> list = new ArrayList<>();
        for (char c : cleanS.toCharArray()) {
            list.add(c);
        }
        int l = 0;
        int r = cleanS.length() - 1;
        while (l < r) {
            if (list.get(l) != list.get(r))
                return false;
            l++;
            r--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));

    }
}
