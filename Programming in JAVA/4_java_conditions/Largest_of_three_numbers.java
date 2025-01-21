import java.util.Scanner;
// Other imports go here// Do NOT change the class name
class Main
{
    public static void main(String[] args)
    {
        // Write your code here
        java.util.Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a>b && a> c)
            System.out.println(a);
        else if(b>a && b>c)
            System.out.println(b);
        else
            System.out.println(c);
            sc.close();
    }
}