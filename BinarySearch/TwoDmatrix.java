package BinarySearch;

public class TwoDmatrix {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        
        int i=0;
        while(i<m-1 && matrix[i][n-1]<=target){
            if(matrix[i][n-1]==target) return true;
            i++;
        }
        
        int l=0;
        int r=n-1;
        while (l<=r) {
            int mid = l+(r-l)/2;
            
            if(matrix[i][mid]==target){
                return true;
            }
            else if(matrix[i][mid] > target){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] matrix = {{1},{3}};
        int target =3;

        System.out.println(searchMatrix(matrix,target));
    }
}
