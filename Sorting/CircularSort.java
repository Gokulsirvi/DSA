import java.util.*;
public class Main{
public static void main(String[] args){
  int[] arr = {7,3,4,5,6,2,1};
  cyclicSort(arr);
  System.out.println(Arrays.toString(arr));
}
 // implementation of Circular sort algo
// in cyclic sort element is form 1-n
static void cyclicSort(int[] arr) {
    int n = arr.length;
    for(int i =0;i<n;i++){
      int index =arr[i]-1;
      if(arr[i] != (i+1)){
        int temp = arr[i];
        arr[i] = arr[index];
        arr[index]= temp;
      }
    }
}
}
