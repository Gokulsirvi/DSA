import java.util.*;
// public class import java.util.*;
public class Main{
  public static void main(String[] args){
    int[] arr = {3,4,1,5,2};
    int n = sLargest2(arr);
    System.out.println(n);
  }
  // brute force method TC -> O(nlogn), SC->O(1)
    public static int sLargest(int[] arr){
      Arrays.sort(arr);
      int max = arr[arr.length-1];
      for(int i=arr.length-1;i>=0;i--){
        if(max != arr[i]){
          return arr[i];
        }
      }
      return -1;
  }
  //optimal approach TC-> n, SC->1
  public static int sLargest2(int[] arr){
    int fmax = arr[0];
    for(int i=1;i<arr.length;i++){
      if(arr[i]>fmax){
        fmax = arr[i];
      }
    }
      int largest = fmax;
      int smax = -1;
      for(int i=0;i<arr.length;i++){
        if(arr[i]>smax && arr[i] != largest){
          smax = arr[i];
        }
      }
    return smax;
  }
}
