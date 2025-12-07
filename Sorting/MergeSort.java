package Sorting;

public class MergeSort {
    static void merge(int arr[],int l,int mid,int r){
        int sz1 = mid - l +1;
        int sz2 = r - mid;
        int[] leftArr = new int[sz1];
        int[] rightArr = new int[sz2];


        for(int i=0;i<sz1;i++){
            leftArr[i] = arr[l+i];
        }
        for(int j=0;j<sz2;j++){
            rightArr[j] = arr[mid+1+j];
        }
        int j=0,i=0;
        int k = l;

        while(i<sz1 && j<sz2){
            if(leftArr[i] <= rightArr[j]){
                arr[k] = leftArr[i];
                i++;
            }
            else{
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        while(i<sz1){
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        while(j<sz2){
            arr[k] = rightArr[j];
            j++;
            k++;
        }

    }
    static void mergeSort(int[] arr,int l,int r){
        if(l >= r) return;
        int mid = (l+r)/2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid+1, r);
        merge(arr,l,mid,r);
    }
    public static void main(String[] args) {
        int[] arr = {3,5,4,9,8,2};
        int n = arr.length;
        mergeSort(arr, 0, n-1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    
}
