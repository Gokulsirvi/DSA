import java.util.*;
public class Main{
public static void main(String[] args){
  int[] arr = {2,3,4,5,2,1};
  mergesort(arr,0,arr.length);
  System.out.println(Arrays.toString(arr));
}
  // implementation of merge sort algorithm via recursion
  static void mergesort(int[] arr,int left,int right){
    if(left==right){
      return;
    }
    int mid = left + (right - left)/2;
    mergesort(arr,left,mid);
    mergesort(arr,mid+1,right);
    merge(arr,left,right,mid);
  }
  static void merge(int[] arr,int left,int right,int mid){
    int rstart = mid+1;
    int[] temp = new int[mid+right];
    int k=0;
    while(left<= mid && rstart<= right){
      if(arr[left]<arr[rstart]){
        temp[k++] = arr[left];
        left++;
      }
      else{
        temp[k++] = arr[rstart];
        rstart++;
      }
    }
     while(left<= mid){
        temp[k++] = arr[left];
        left++;
      }
     while(left<= mid && rstart<= right){
        temp[k++] = arr[rstart];
        rstart++;
    }
  }
}
