public class ReverseArray{
  static void reverse(int[] arr,int n,int i){
     if(n/2 < 1) return;
     swap(n,i,arr);
    reverse(arr,n-1,i++);
  }
  static void swap(int i,int j,int[] arr){
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
  public static void main(String[] args){
    int[] arr = {1,2,3,4,5};
    reverse(arr,4,0);
  }
}
