package ArraysAndHashing.Leetcode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;

class Example {
    static public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] arr = new int[2 * n];

        for (int i = 0; i < n; i++) {
            arr[i] = nums[i];
            arr[i + n] = nums[i];
        }

        return arr;

    }

    public static void main(String[] args) {
        // int[] arr = {1,2,1};
        // int[] nums = arr;
        // int n = nums.length;
        // HashSet<Integer> set4 = new HashSet<>();
        // set.add(34);
        // set.add(30);
        // set.add(32);
        // set.add(33);
        // System.out.println(set.contains(34));
        // System.out.println(set.add(34));

        // HashMap<Integer,String> map = new HashMap<>();
        // map.put(12,"anand");

        // String s = "ab";
        // String t = "a";
        // if(s.length() != t.length()) System.out.print("false") ;
        // char[] nams = s.toCharArray();
        // HashMap<Character,Integer> map = new HashMap<>();
        // for (Character val : nams) {

        // }

        // for(char val : t.toCharArray()){
        // if(!set.contains(val)) System.out.print("false");
        // }

        // String s = "aacc";
        // String t = "ccaa";

        // if(s.length() != t.length()) System.out.print("false") ;
        // HashMap<Character,Integer> map = new HashMap<>();

        // for (char c : s.toCharArray()) {
        // map.put(c,map.getOrDefault(c, 0)+1);
        // }

        // for (char c : t.toCharArray()) {
        // if (!map.containsKey(c)) {
        // System.out.println("False");
        // }

        // map.put(c, map.get(c)-1);

        // if(map.get(c) == 0){
        // map.remove(c);
        // }
        // }
        // int target = 9;
        // int[] nums = {2,7,11,15};
        // int n = nums.length;
        // ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        // for(int i=0;i<n;i++){
        // for(int j=i;j<n-1;j++){
        // ArrayList<Integer> temp = new ArrayList<Integer>();
        // if(nums[j]+nums[j+1] == target){
        // temp.add(nums[j]);
        // temp.add(nums[j+1]);
        // arr.add(temp);
        // }
        // }
        // }

        // int[][] res = new int[arr.size()][];
        // for(int i=0;i<arr.size();i++){
        // for(int j=0;j<arr.size()-1;j++){
        // res[i][j] = arr[i][j];
        // }
        // }

        // System.out.println(arr);

        // String[] str = {"flower","flow","flight","overflow"};
        // int min = Integer.MAX_VALUE;
        // int n = str.length;
        // int indx = 0;
        // int cnt =0;

        // for(String wrd : str){
        // if(wrd.length() < min ){
        // min = wrd.length();
        // indx =cnt;
        // }
        // cnt++;
        // }

        // HashMap<Character,Integer> map = new HashMap<>();
        // int next =0;

        // int tempsz = 0;
        // for(char c : str[indx].toCharArray()){
        // map.put(c, next++);
        // tempsz++;
        // }

        // int count = 0;
        // int minsz = Integer.MAX_VALUE;
        // char[] res = new char[tempsz];

        // for(int i = 0;i<n;i++){
        // count =0;

        // int temp=0;
        // for(char c: str[i].toCharArray()){
        // if(map.containsKey(c) && map.containsValue(temp)){
        // count++;
        // System.out.println(i+" : "+c);
        // }
        // temp++;
        // }
        // if(count<minsz) minsz = count;

        // }

        // System.out.println("minsz: " +minsz);

        // int[] nums = {3,2,3};
        // int n = nums.length;
        // HashMap<Integer,Integer> map = new HashMap<>();
        // for(int c : nums){
        // map.put(c,map.getOrDefault(c,0)+1);
        // }

        // for(int val : nums){
        // if(map.get(val)>n/2){
        // System.out.println(val);
        // }
        // }

        // int[] nums = {3,6,2,3,8,4,1};
        // int n = nums.length;

        // PriorityQueue<Integer> pq= new PriorityQueue<>();

        // for(int i=0;i<n;i++){
        // pq.add(nums[i]);
        // }
        // int i=0;

        // while(!pq.isEmpty()){
        // nums[i++] = pq.poll();
        // }
        // for(int j=0;j<n;j++){
        // System.out.print(nums[j]+" ");
        // }

        // int[] nums = { 6, 5, 4, 3, 2, 1 };
        // nums = mergeSort(nums);
        // for (int j = 0; j < nums.length; j++) {
        // System.out.print(nums[j] + " ");
        // }
        // int[] nums = {1,2,1,2,1,2,3,1,3,2};
        // int k = 2;
        // HashMap<Integer,Integer> map = new HashMap<>();

        // for (int i : nums) {
        // map.put(i,map.getOrDefault(i, 0)+1);
        // }

        // int[] arr = new int[k];
        // int max =0;

        // for(int i : nums){
        // if(map.get(i) > max){
        // max = i;
        // }
        // }
        // char[] s ={'h','e','l','l','o'};
        // int i=0;
        // int j = s.length-1;

        // while(i<j){
        // char temp = s[j];
        // s[j] = s[i];
        // s[i] = temp;
        // i++;
        // j--;
        // }
        // for (int j2 = 0; j2 < s.length; j2++) {
        // System.out.println(s[j2]);
        // }

        // String s = "A man, a plan, a canal: Panama";
        // String cleanS = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        // char[] wrd = new char[cleanS.length()];
        // int i=0;
        // for(char c : cleanS.toCharArray()){
        // wrd[i++] = c;
        // }

        // for (int j = 0; j < wrd.length; j++) {
        // System.out.print(wrd[j]);
        // }
        // int l = 0;
        // int r = wrd.length-1;
        // System.out.println(wrd.length);
        // while(l<r){
        // if(wrd[l] != wrd[r]) System.out.println("false");
        // l++;
        // r--;
        // }

        // int[] nums = {0,0,1,1,1,2,2,3,3,4};
        // int s = 0;
        // int f =1;
        // int cnt =0;
        // int n = nums.length;
        // while(f<n){
        // cnt++;
        // while(nums[s] == nums[f] && f<n-1){
        // f++;
        // }
        // s = f;
        // f++;
        // }
        // System.out.println(cnt);

        // int nums[] = {1,2,3,4,5,6,7};
        // int k = 3;
        // int l= 0;
        // int n = nums.length;
        // int r= n-1;

        // while(l<r){
        // int temp = nums[l];
        // nums[l] = nums[r];
        // nums[r] = temp;
        // l++;
        // r--;
        // }
        // l=0;
        // r=k-1;

        // while(l<r){
        // int temp = nums[l];
        // nums[l] = nums[r];
        // nums[r] = temp;
        // l++;
        // r--;
        // }

        // for(int i= 0;i<n;i++){
        // System.out.print(nums[i] + " ");
        // }
        // System.out.println();
        // l=k;
        // r = n-1;
        // while(l<r){
        // int temp = nums[l];
        // nums[l] = nums[r];
        // nums[r] = temp;
        // l++;
        // r--;
        // }

        // for(int i= 0;i<n;i++){
        // System.out.print(nums[i] + " ");
        // }

        // String word1 = "ab";
        // String word2 = "pqrs";
        // char[] arr1 = new char[word1.length()];
        // char[] arr2 = new char[word2.length()];
        // int i=0;

        // for(char c: word1.toCharArray()){
        // arr1[i++] = c;
        // }

        // i = 0;
        // for(char c: word2.toCharArray()){
        // arr2[i++] = c;
        // }

        // int n = word1.length()+word2.length();
        // char[] arr = new char[n];
        // int p1 =0;
        // int p2 =0;
        // i=0;

        // while(p1<arr1.length && p2<arr2.length){
        // arr[i++] = arr1[p1++];
        // arr[i++] = arr2[p2++];
        // }
        // while(p1 != arr1.length){
        // arr[i++] = arr1[p1++];
        // }
        // while(p2 != arr2.length){
        // arr[i++] = arr2[p2++];
        // }

        // String str = new String(arr);
        // System.out.print(str);

        // int[] nums1 = {1,2,3};
        // int m = 3;
        // int[] nums2 = {2,5,6};
        // int n = 3;

        // nums1 = Arrays.copyOf(nums1, m+n);
        // int t=0;

        // for(int i=m;i<m+n;i++){
        // nums1[i] = nums2[t++];
        // }

        // for (int i = 0; i < nums1.length; i++) {
        // System.out.print(nums1[i]+" ");
        // }

        // int[] nums = {0,1,1,1,2,2,3,3,4};
        // int r = 1;
        // int w = 1;
        // int n = nums.length;

        // while(r<n){
        // if(nums[r] != nums[r-1]){
        // nums[w] = nums[r];
        // w++;
        // }
        // r++;
        // }
        // while(w<n){
        // nums[w++] = 0;
        // }

        // for (int i = 0; i < nums.length; i++) {
        // System.out.print(nums[i]+" ");
        // }
        // System.out.println();
        // int k =0;
        // do{
        // k++;
        // }while(nums[k]!=0);

        // int[] numbers ={2,3,4};
        // int target = 7;
        // int[] res = twoSum(numbers,target);

        // for (int i = 0; i < res.length; i++) {
        // System.out.print(res[i]+" ");
        // }
        // int[] nums = {2,2,2,2};
        // int target =8;
        // List<List<Integer>> res = new ArrayList<>();
        // Arrays.sort(nums);
        // int n = nums.length;
        
        // for(int i=0;i<n-3;i++){
        //     if(i>0 && nums[i] == nums[i-1]) continue;
        //     for(int j=i+1;j<n-2;j++){
        //         int r =n-1;
        //         int l =j+1;
        //         while(l<r){
        //             int sum = nums[l]+nums[r]+nums[i]+nums[j];
        //             if(sum == target){
        //                 res.add(Arrays.asList(nums[i],nums[j],nums[l],nums[r]));
        //                 l++;
        //                 r--;
        //             }
        //             else if(sum<target){
        //                 l++;
        //             }
        //             else{
        //                 r--;
        //             }
        //         }
        //     }
        // }
        
        // System.out.println(res);
        // int[] height = {1,8,6,2,5,4,8,3,7};

        // int n =height.length;
        // int l =0;
        // int r =n-1;
        // int maxArea = 0;
        // while(l<r){
        //     int min = Math.min(height[l],height[r]);
        //     int temp = min*(r-l);
        //     if(temp>maxArea) maxArea = temp;

        //     if(height[l]<height[r]){
        //         l++;
        //     }
        //     else{
        //         r--;
        //     }
        // }

        // System.out.println(maxArea);

        // int[] people = {1,2};
        // int limit = 3;

        // int l =0;
        // Arrays.sort(people);
        // int n =people.length;
        // int r = n-1;
        // int cnt=0;

        // while(l<r){
        //     int sum = people[l]+people[r];
        //     if( sum == limit){
        //         cnt++;
        //         l++;
        //         r--;
        //     }
        //     else if(sum>limit){
        //         r--;
        //     }
        //     else{
        //         l++;
        //     }
        // }
        // int boats = n-2*cnt+cnt;
        // System.out.println(boats);

        // int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        // int l=0;
        // int r=height.length-1;
        // int leftMax = height[l];
        // int rightMax = height[r];
        // int water = 0;

        // while(l<r){
        //     if(height[l]<height[r]){
        //         if(height[l]>=leftMax){
        //             leftMax = height[l];
        //         }
        //         else{
        //             water += leftMax - height[l];
        //         }
        //         l++;
        //     }
        //     else{
        //         if(height[r]>=rightMax){
        //             rightMax = height[r];
        //         }
        //         else{
        //             water += rightMax-height[r];
        //         }
        //         r--;
        //     }
        // }
        // System.out.println(water);

        String s = "anand is. ^ a good MAn";
        String cleanS = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        System.out.println(cleanS);


        
    }

    

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        int n = nums.length;
        int r = n - 1;
        int l = 0;
        while (l < r) {
            int k = l+1;
            while (k < r) {
                if (nums[l] + nums[r] + nums[k] == 0) {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[l]);
                    temp.add(nums[r]);
                    temp.add(nums[k]);
                    list.add(temp);
                }
                k++;
            }
            l++;
            r--;
        }
        return list;
    }

    public static int[] twoSum(int[] numbers, int target) {
        int l = 0;
        int n = numbers.length;
        int r = n - 1;
        if (n < 3)
            return numbers;

        while (l < n) {
            if (numbers[l] + numbers[r] > target) {
                r--;
            } else if (numbers[l] + numbers[r] < target) {
                l++;
            } else {
                break;
            }
        }
        return new int[] { numbers[l], numbers[r] };
    }

    public static boolean isPalindrome(char[] arr, int l, int r) {
        while (l < r) {
            if (arr[l] != arr[r])
                return false;
            l++;
            r--;
        }
        return true;

    }

    public static boolean validPalindrome(String s) {
        char[] arr = new char[s.length()];
        int i = 0;
        for (char c : s.toCharArray()) {
            arr[i++] = c;
        }
        int n = arr.length;
        int l, r;
        l = 0;
        r = arr.length - 1;

        while (l < r) {
            if (arr[l] != arr[r]) {
                if (!(isPalindrome(arr, l, r - 1) || isPalindrome(arr, l + 1, r)))
                    return false;
            }
            l++;
            r--;
        }
        return true;
    }

    static int[] mergeSort(int[] arr) {
        if (arr.length > 1) {
            int mid = arr.length / 2;
            System.out.println("arr.length : " + arr.length);
            System.out.println("mid: " + mid);
            int[] leftArr = new int[mid];
            int[] rightArr = new int[arr.length - mid];
            System.out.println("arr.length-mid : " + (arr.length - mid));
            int l = 0;
            for (int i = 0; i < mid; i++) {
                System.out.println("leftarr " + i + " : " + arr[i]);
                leftArr[l++] = arr[i];
            }
            int r = 0;
            for (int i = mid + 1; i < arr.length; i++) {
                System.out.println("rightarr " + i + " : " + arr[i]);
                rightArr[r++] = arr[i];
            }

            mergeSort(leftArr);
            mergeSort(rightArr);
            System.out.println("working");

            arr = merge(leftArr, rightArr);
        }
        return arr;
    }

    static int[] merge(int[] leftArr, int[] rightArr) {
        int l, r, i;
        l = r = i = 0;
        int n = leftArr.length + rightArr.length;
        int[] newArr = new int[n];
        while (i < n) {
            if (l < leftArr.length && r < rightArr.length) {
                if (leftArr[l] < rightArr[r]) {
                    newArr[i] = leftArr[l];
                    l++;
                    i++;
                } else {
                    newArr[i] = rightArr[r];
                    r++;
                    i++;
                }
            } else {
                if (l >= leftArr.length) {
                    while (r < rightArr.length) {
                        newArr[i] = rightArr[r];
                        i++;
                        r++;
                    }
                }
                if (r >= rightArr.length) {
                    while (l < leftArr.length) {
                        newArr[i] = leftArr[l];
                        l++;
                        i++;
                    }
                }
            }

        }

        return newArr;
    }
}
