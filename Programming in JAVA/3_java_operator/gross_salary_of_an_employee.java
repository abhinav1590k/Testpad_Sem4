import java.util.Scanner;

class Main
{
  public static void main(String[] args)
  {
      // Write your code here
      java.util.Scanner sc = new Scanner(System.in);
      int sal = sc.nextInt();
      int HRA = sal *10/100;
      int DA = sal*20/100;
      int totalsal = sal + HRA + DA;
      System.out.println(totalsal);
      sc.close();
  }
}