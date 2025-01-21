import java.util.Scanner;
// Other imports go here
// Do NOT change the class name
class Main
{
    public static void main(String[] args)
    {
        // Write your code here
        java.util.Scanner sc = new Scanner(System.in);
        int sum =0;
        int n = sc.nextInt();
        for(int i=1;i<=n;i++)
            sum+=i;
        System.out.println(sum);
    }
}