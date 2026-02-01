public class SumOfNumber{
  public static int sum(int n){
    if(n==0) return n;
    return n+sum(n-1);
  }
  public static void main(String[] args){
    int sum = sum(6);
    System.out.println(sum);
  }
}
