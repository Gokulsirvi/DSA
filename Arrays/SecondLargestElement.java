import java.util.*;
public class Main{
  public static void main(String[] args){
    int[] arr = {3,4,1,5,2};
    int n = sLargest2(arr);
    System.out.println(n);
  }
  // brute force method TC -> O(nlogn), SC->O(1)
    public static int sLargest(int[] arr){
      Arrays.sort(arr);
      return arr[arr.length-2];
  }
  //optimal approach TC-> n, SC->1
  public static int sLargest2(int[] arr){
    int max = arr[0];
    int smax = -1;
    for(int i=1;i<arr.length;i++){
      if(arr[i]>max){
        smax = max;
        max = arr[i];
      }
    }
      return smax;
  }
}
