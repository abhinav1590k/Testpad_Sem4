import java.util.Scanner;
// Other imports go here// Do NOT change the class name
class Main
{
    public static void main(String[] args)
    {
        // Write your code here
        java.util.Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%2==0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}