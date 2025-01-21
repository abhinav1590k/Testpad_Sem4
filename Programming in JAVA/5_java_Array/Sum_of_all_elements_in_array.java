import java.util.Scanner;
// Other imports go here
class Main
{
  public static void main(String[] args)
  {
    // Write your code here
      Scanner sc = new Scanner(System.in);
      int[] arr = new int[10];
      for(int i=0;i<10;i++){
          arr[i]=sc.nextInt();
      }
      int sum = 0;
      for(int i=0;i<10;i++){
          sum+=arr[i];
      }
      System.out.println(sum);
  }
}