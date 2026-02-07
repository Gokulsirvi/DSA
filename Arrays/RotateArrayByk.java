import java.util.*;
public class RotateArrayByk{
  public static void main(String[] args){
    int[] arr = {1,2,3,4,5,6,7};
    rotate(arr,3);
    System.out.println(Arrays.toString(arr));
  }
  
  // brute TC->n+k, SC->k
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
