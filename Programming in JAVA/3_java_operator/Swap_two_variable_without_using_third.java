import java.util.Scanner;
// Other imports go here// Do NOT change the class name
class Main
{
  public static void main(String[] args)
  {   
    // Write your code here
      java.util.Scanner sc = new Scanner(System.in);
      int num1 = sc.nextInt();
      int num2 = sc.nextInt();
      num1 = num1 + num2;
      num2 = num1-num2;
      num1 = num1 -num2;
      System.out.println(num1);
      System.out.println(num2);
      sc.close();
  }
}