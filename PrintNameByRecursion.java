public class PrintNameByRecursion{
  public static void main(String[] args){
    printName(0,1);
  }
  static void printName(int i, int n) {
        if (i > n) return;
        System.out.println("Gokul");
        printName(i + 1, n);
    }
}
