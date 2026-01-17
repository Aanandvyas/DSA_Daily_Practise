package BinarySearch;

import java.util.Arrays;

public class KokoBanana {
    public static int minEatingSpeed(int[] piles, int h) {
        long sum =0;
        int max =0;
        for(int i:piles){
            sum+=i;
            max= Math.max(max,i);
        }
        Arrays.sort(piles);
        if(h==piles.length) return max;

        long k=0;
        long l=1;
        long r=max;
        int j=h-piles.length;

        if(piles.length-j>0){
            return piles[piles.length-j-1];
        }
        while(l<=r){
            long temp = sum;
            long mid = l+(r-l)/2;
            System.out.println("mid: "+mid);
            k=mid;//3
            int p=0;
            long n=0;
            //piles =6
            while (p<piles.length) {
                System.out.println("piles: "+piles[p]);
                if(piles[p]<=k){
                    p++;
                }
                else if(piles[p]%k==0){
                    n+=(long)piles[p++]/k;
                }
                else{
                    n+=(long)piles[p++]/k;
                    n++;
                }
                System.out.println("n: "+n);
            }
            if(n<h){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return (int)k;
    }
    public static void main(String[] args) {
        int[] piles = {3,6,7,11};
        int h=8;
        System.out.println(minEatingSpeed(piles, h));
    }
}
