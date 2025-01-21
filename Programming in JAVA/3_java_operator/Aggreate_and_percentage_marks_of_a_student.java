import java.util.Scanner;

class Main
{
  public static void main(String[] args)
  {
    // Write your code here
      java.util.Scanner sc = new Scanner(System.in);
      int marks1=sc.nextInt();
      int marks2=sc.nextInt();
      int marks3=sc.nextInt();
      int marks4=sc.nextInt();
      int marks5=sc.nextInt();
      int agg =0;
      int percentage = 0;
      agg = marks1 + marks2 +marks3 +marks4 + marks5;
      percentage = agg/5;
      System.out.print(agg+" "+percentage);
      sc.close();
  }
}