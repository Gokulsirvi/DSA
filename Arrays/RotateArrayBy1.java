import java.util.*;
public class RotateArrayBy1{
  public static void main(String[] args){
    int[] arr = {0,0,1,1,1,2,2,3,3,4};
    rotate(arr);
    System.out.println(Arrays.toString(arr));
  }
  
  //  TC->n, SC->1
   public static void rotate(int[] arr){
      int temp = arr[0];
      for(int i=1;i<arr.length;i++){
          arr[i-1] = arr[i];
      }
      arr[arr.length-1] = temp;
  }
  
}
