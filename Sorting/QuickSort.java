import java.util.*;
public class Main{
public static void main(String[] args){
  int[] arr = {7,3,4,5,2,1};
  quickSort(arr,0,arr.length-1);
  System.out.println(Arrays.toString(arr));
}
 // implementation of Quick sort algo via recursion

static void quickSort(int[] arr, int left, int right) {
    // Base Case: Stop if the subarray has 0 or 1 element
    if (left >= right) return;

    int i = left;
    int j = right;
    int pivot = arr[left + (right - left) / 2]; 

    while (i <= j) {
        // Find element on left that should be on right
        while (arr[i] < pivot) i++;
        // Find element on right that should be on left
        while (arr[j] > pivot) j--;

        if (i <= j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    // Recursion call 
    if (left < j) quickSort(arr, left, j);
    if (i < right) quickSort(arr, i, right);
}


}
