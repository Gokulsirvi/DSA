import java.util.*;
public class Main{
public static void main(String[] args){
  int[] arr = {2,3,4,5,2,1};
  sort(arr);
  System.out.println(Arrays.toString(arr));
}
  static void sort(int[] arr){
    int n = arr.length;
    for(int i=1;i<n;i++){
      //select a key = arr[i]
        int key = arr[i];
      //take a pointer 
      int j = i-1;
      //run a loop and find the correct position of key and swap another to +1 index
      while(j>=0 && arr[j]>key){
       arr[j+1] = arr[j];
       j=j-1;
      }
      arr[j+1] = key;
    }
  }
}
