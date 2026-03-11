public class LinearSearch{
public static void main(String[] args) {
    int[] arr = {1,2,3,4,5};
    int i = linearSearch(arr,4);
    System.out.println(i);
}
public static int linearSearch(int[] arr,int key){
    int n = arr.length;
    for(int i=0;i<n;i++){
        if(arr[i]==key){
            return i;
        }
    }
    return -1;
}
}
