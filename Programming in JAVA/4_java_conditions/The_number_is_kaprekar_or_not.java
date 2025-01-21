import java.util.Scanner;
// Other imports go here// Do NOT change the class name
class Main
{
    public static void main(String[] args)
    {
        // Write your code here
        java.util.Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        while(N>0){
            int n = sc.nextInt();
            int square = n*n;
            String strsquare = String.valueOf(square);
            String nstr = String.valueOf(n);
            int len = nstr.length();
            String rightPart = strsquare.length() > len ? strsquare.substring(strsquare.length() - len) : strsquare;
            String leftPart = strsquare.length() > len ? strsquare.substring(0, strsquare.length() - len) : "0";
            int right = Integer.parseInt(rightPart);
            int left = Integer.parseInt(leftPart);
            if (left + right == n) {
                System.out.println(1); 
            } else {
                System.out.println(0); 
            }

            N--;
        }
    }
}