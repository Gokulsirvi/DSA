import java.util.Arrays;

public class MoveZeros{

    public static void main(String[] args){
        int[] arr = {1,2,3,0,4,0,6,0,9,0,8,0};
        moveZero2(arr);
        System.out.println(Arrays.toString(arr));
    }

    // tc-> O(2n)
    // sc-> O(n)
   public static void moveZero1(int[] arr){
    int n = arr.length;
  
    int[] temp = new int[n];
    int k = 0;
    for(int i : arr){
        if(i != 0){
          temp[k++] = i;
        }
        //System.out.println(i);
    }
    for(int i=0;i<k;i++){
        arr[i] = temp[i];
    }
    for(int i=k;i<n;i++){
        arr[i] = 0;
    }
   }

   //optimal 
   //tc->O(2n)   sc->O(1)
   public static void moveZero2(int[] arr){
        int n = arr.length;
        int i=0;
        int j=-1;
        for(;i<n;i++){
            if(arr[i]==0){
                j=i;
                break;
            }
        }
        for(;i<n;i++){
            if(arr[i]!=0){
                arr[j++] = arr[i];
                arr[i] = 0;
            }
        }
    }
}


