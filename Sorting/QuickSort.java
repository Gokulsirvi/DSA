import java.util.*;
public class Main{
public static void main(String[] args){
  int[] arr = {7,3,4,5,2,1};
  quickSort(arr,0,arr.length);
  System.out.println(Arrays.toString(arr));
}
  // implementation of Quick sort algorithm via recursion
  static void quickSort(int[] arr,int left,int right){
    int pivot = left+(right-left)/2;
    while(left > right){
      while(arr[left] > arr[pivot]) left++;
      while(arr[right] < arr[pivot]) right--;
      int temp = arr[left];
      arr[left] = arr[right];
      arr[right] = temp;
    }
    quickSort(arr,left,pivot);
    quickSort(arr,right,pivot);
  }
}
