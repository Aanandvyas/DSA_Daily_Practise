package BinarySearch;

public class SQRT {
    public static int mySqrt(int x) {
        if(x<2) return x;
        int l=0;
        int r=x/2;
        int ans=0;
        while(l<=r){
            int m=l+(r-l)/2;
            if(m*m==x){
                return m;
            }
            else if(m*m<x){
                ans = m;
                l=m+1;
            }
            else{
                r=m-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int x = 2147395599;
        System.out.println(mySqrt(x));
    }
}
