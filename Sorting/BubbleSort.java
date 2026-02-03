import java.util.Arrays;

public class BubbleSort{
  public static void main(String[]args){
    int[] arr = {2,1,3,4};
    sort(arr);
    System.out.println(Arrays.toString(arr));
  }
  static void sort(int[] arr){
    int n = arr.length;
    int flag = 0;
    for(int i=0;i<n;i++){
      flag = 0;
      for(int j=0;j<n-i-1;j++){
        if(arr[j]>arr[j+1]){
          flag =1;
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
        }
      }
      if(flag==0){
        break;
      }
    }
  }
}
