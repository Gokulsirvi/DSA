public class Fibonacci{
  //print fibonacci series a=0,b=1
  static void fib(int n,int a,int b){
    if(n==0) return;
    int c = a+b;
    System.out.println(a);
    fib(n-1,b,c);
  }
}
