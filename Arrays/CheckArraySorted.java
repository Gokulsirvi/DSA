import java.util.*;
// public class import java.util.*;
public class CheckArraySorted{
  public static void main(String[] args){
    int[] arr = {3,4,1,5,2};
    boolean n = check(arr);
    System.out.println(n);
  }
  // brute force method TC -> n, SC->O(1)
    public static boolean check(int[] arr){
      for(int i=1;i<arr.length;i++){
        if(arr[i]<arr[i-1]){
          return false;
        }
      }
      return true;
  }
}
