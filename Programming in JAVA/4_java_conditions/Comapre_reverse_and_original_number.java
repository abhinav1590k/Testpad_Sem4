import java.util.Scanner;
// Other imports go here// Do NOT change the class name
class Main
{
    public static void main(String[] args)
    {
        // Write your code here
        java.util.Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        while(n>0){
            int num = sc.nextInt();
            int orginalnum = num;
            int temp = 0;
            while(num >0){
                int digit = num%10;
                temp = temp*10+digit;
                num/=10;
            }
            if(temp == orginalnum)
                System.out.println("Equal");
            else
                System.out.println("Not Equal");
            n--;
        }
    }
}