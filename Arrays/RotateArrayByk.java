// leetcode 189
import java.util.*;
public class RotateArrayByk{
  public static void main(String[] args){
    int[] arr = {1,2,3,4,5,6,7};
    rotate1(arr,3);
    System.out.println(Arrays.toString(arr));
  }
  public static void reverse(int[] arr ,int i,int j){
    //   j = j-1;
      for(int k = i;k<j/2;k++){
          int temp = arr[k];
          arr[k] = arr[j-k-1];
          arr[j-k-1] = temp;
      }
  }
    //  TC->2n, SC->1
   public static void rotate1(int[] arr,int k){
       int n = arr.length;
      k = n-k;
      reverse(arr,0,k);
      reverse(arr,0,n);
      reverse(arr,0,n-k);
  }
  //  TC->n+k, SC->k
   public static void rotate(int[] arr,int k){
      int[] temp = new int[k];
      for(int i=0;i<k;i++){
          temp[i] = arr[i];
      }
      for(int i=k;i<arr.length;i++){
          arr[i-k] = arr[i];
      }
      for(int i = arr.length-k;i<arr.length;i++){
          arr[i] = temp[i-(arr.length-k)];
      }
  }
  
}
