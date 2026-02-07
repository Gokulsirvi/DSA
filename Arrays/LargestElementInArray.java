import java.util.*;
public class Main{
  public static void main(String[] args){
    int[] arr = {3,2,1,5,2};
    int n = largest1(arr);
    System.out.println(n);
  }
  // brute force method TC -> O(nlogn), SC->O(1)
  public static int largest1(int[] arr){
    Arrays.sort(arr);
    return arr[arr.length-1];
  }
  
  // optimal TC-> O(n),SC->O(1)
    public static int largest2(int[] arr){
    int max = arr[0];
    for(int i=1;i<arr.length;i++){
      if(arr[i]>max){
        max = arr[i];
      }
    }
      return max;
  }
}
