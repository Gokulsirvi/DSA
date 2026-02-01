import java.util.Arrays;

public class BubbleSort{
  public static void main(String[]args){
    int[] arr = {2,1,3,4};
    sort(arr);
    System.out.println(Arrays.toString(arr));
  }
  static void sort(int[] arr){
    int n = arr.length;
    for(int i=0;i<n;i++){
      for(int j = i+1;j<n;j++){
        if(arr[i]>arr[j]){
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    }
  }
}
