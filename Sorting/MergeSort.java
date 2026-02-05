import java.util.*;
public class Main{
public static void main(String[] args){
  int[] arr = {7,3,4,5,2,1};
  mergesort(arr,0,arr.length);
  System.out.println(Arrays.toString(arr));
}
  // implementation of merge sort algorithm via recursion
  static void mergesort(int[] arr,int left,int right){
    if (right - left <= 1) return;
    int mid = left + (right - left)/2;
    mergesort(arr,left,mid);
    mergesort(arr,mid,right);
    merge(arr,left,right,mid);
  }
 
 static void merge(int[] arr, int left, int right, int mid) {
        int[] temp = new int[right - left]; //  size
        int i = left;      // Pointer for left half
        int j = mid;       // Pointer for right half
        int k = 0;         // Pointer for temp array

        while (i < mid && j < right) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        // remaining elements
        while (i < mid) temp[k++] = arr[i++];
        while (j < right) temp[k++] = arr[j++];

        // Copy temp back to original array
        for (int p = 0; p < temp.length; p++) {
            arr[left + p] = temp[p];
        }
    }
}
