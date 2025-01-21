import java.util.Scanner;

class Main
{
  public static void main(String[] args)
  {
    // Write your code here
      java.util.Scanner sc= new Scanner(System.in);
      int num = sc.nextInt();
      int muti = 1;
      int temp = 0;
      while(num>0){
          int digit = num %10;
          if(digit == 9){
              digit = 0;
          }
          else{
              digit++;
          }
          temp = temp + digit * muti;
          muti*=10;
          num/=10;
      }
      System.out.println(temp);
  }
}