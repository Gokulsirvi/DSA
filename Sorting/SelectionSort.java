import java.util.*;
public class SelectionSort{
  public static void main(String[] args){
    int[] arr= {4,3,5,62,1};
    sort(arr);
    System.out.println(Arrays.toString(arr));
  }
  static void sort(int[] arr){
    int n = arr.length;
    for(int i=0 ;i<n;i++){
      int min = i;
      for(int j = i+1;j<n;j++){
        if(arr[j]< arr[min]){
          min = j;
        }
      }
      int temp = arr[i];
      arr[i] = arr[min];
      arr[min] = temp;
      }
    }
  }
