public class module10 {
    public static void main(String[] args) {
        int n = 5;

        numberTriangle(n);
        numberReverseTriangle(n);
        numberMirror(n);

        starTriangle(n);
        starReverseTriangle(n);
        rightStar(n);
        leftStar(n);

        pyramid(n);
        invertedPyramid(n);
        diamond(n);

        alphabetTriangle(n);
        alphabetReverseTriangle(n);
        alphabetMirror(n);

        fullAlphabet(n);
        fullAlphabetReverse(n);

        hollowSquare(n);
        hollowPyramid(n);
    }

    /*
    1
    1 2
    1 2 3
    1 2 3 4
    */
    static void numberTriangle(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    /*
    1 2 3 4
    1 2 3
    1 2
    1
    */
    static void numberReverseTriangle(int n) {
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    /*
          1
        1 2
      1 2 3
    */
    static void numberMirror(int n) {
        for(int i=1;i<=n;i++){
            for(int s=1;s<=n-i;s++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    /*
    *
    * *
    * * *
    */
    static void starTriangle(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*
    * * *
    * *
    *
    */
    static void starReverseTriangle(int n) {
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*
        *
       **
      ***
     ****
    */
    static void rightStar(int n) {
        for(int i=1;i<=n;i++){
            for(int s=1;s<=n-i;s++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
    ****
     ***
      **
       *
    */
    static void leftStar(int n) {
        for(int i=n;i>=1;i--){
            for(int s=1;s<=n-i;s++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
       *
      ***
     *****
    */
    static void pyramid(int n) {
        for(int i=1;i<=n;i++){
            for(int s=1;s<=n-i;s++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
    *****
     ***
      *
    */
    static void invertedPyramid(int n) {
        for(int i=n;i>=1;i--){
            for(int s=1;s<=n-i;s++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
       *
      ***
     *****
      ***
       *
    */
    static void diamond(int n) {
        pyramid(n);
        invertedPyramid(n-1);
    }

    /*
    A
    A B
    A B C
    */
    static void alphabetTriangle(int n) {
        for(int i=1;i<=n;i++){
            char ch='A';
            for(int j=1;j<=i;j++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }

    /*
    A B C
    A B
    A
    */
    static void alphabetReverseTriangle(int n) {
        for(int i=n;i>=1;i--){
            char ch='A';
            for(int j=1;j<=i;j++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }

    /*
          A
        A B
      A B C
    */
    static void alphabetMirror(int n) {
        for(int i=1;i<=n;i++){
            for(int s=1;s<=n-i;s++){
                System.out.print("  ");
            }
            char ch='A';
            for(int j=1;j<=i;j++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }

    /*
    A
    B B
    C C C
    */
    static void fullAlphabet(int n) {
        char ch='A';
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(ch+" ");
            }
            ch++;
            System.out.println();
        }
    }

    /*
    C C C
    B B
    A
    */
    static void fullAlphabetReverse(int n) {
        char ch=(char)('A'+n-1);
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(ch+" ");
            }
            ch--;
            System.out.println();
        }
    }

    /*
    * * * *
    *     *
    *     *
    * * * *
    */
    static void hollowSquare(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1 || i==n || j==1 || j==n)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    /*
       *
      * *
     *   *
    *******
    */
    static void hollowPyramid(int n) {
        for(int i=1;i<=n;i++){
            for(int s=1;s<=n-i;s++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                if(j==1 || j==2*i-1 || i==n)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
