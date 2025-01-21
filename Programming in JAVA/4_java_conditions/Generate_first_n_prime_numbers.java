import java.util.Scanner;
// Other imports go here
// Do NOT change the class name
class Main
{
    public static void main(String[] args)
    {
        // Write your code here
        java.util.Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int count  = 0;
        for(int i=2;i<=n;i++){
            boolean isprime = true;
            for(int j=2;j*j<=i;j++){
                if(i%j == 0){
                    isprime = false;
                    break;
                }
            }
            if (isprime) {
                System.out.println(i);
                count++;
            }
            if (count == m) {
                break;
            }
        }
    }
}