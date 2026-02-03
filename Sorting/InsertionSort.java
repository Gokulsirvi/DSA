import java.util.*;
public class InsertionSort{
public static void main(string[] args){
  int[] arr = {2,3,4,5,2,1};
  sort(arr);
  System.out.println(Arrays.toString(arr));
}
  static void sort(int[] arr){
    int n = arr.length;
    for(int i=0;i<n;i++){
      int j = i;
      while(j>0 && arr[j]>arr[i]){
        j--;
      }
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
    }
  }
}
