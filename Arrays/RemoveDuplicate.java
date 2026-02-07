// leetcode 26
import java.util.*;
// public class import java.util.*;
public class RemoveDuplicate{
  public static void main(String[] args){
    int[] arr = {0,0,1,1,1,2,2,3,3,4};
    int  i = remove1(arr);
    System.out.println(Arrays.toString(arr)+i);
  }
  
  // optimal approach TC->2n
   public static int remove1(int[] arr){
      int i = 1;
      for(int j=1;j<arr.length;j++){
          if(arr[j]!=arr[j-1]){
              arr[i++] = arr[j];
          }
      }
      return i-1;
  }
  // brute force method TC -> nlogn+n, SC->O(n)
    public static int remove(int[] arr){
      Set<Integer> st = new HashSet<>();
      for(int i=0;i<arr.length;i++){
        st.add(arr[i]);
      }
      int j = 0;
      for(int i : st){
          arr[j++] = i;
      }
      return j;
  }
  
}
