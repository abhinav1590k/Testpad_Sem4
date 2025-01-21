import java.util.Scanner;
// Other imports go here
class Main
{
  public static void main(String[] args)
  {
    // Write your code here
      Scanner sc = new Scanner(System.in);
      int[] arr = new int[10];
      int [] copyarr = new int[10];
      
      
      for(int i=0;i<10;i++){
          arr[i] = sc.nextInt();
      }
      for(int i=0;i<10;i++){
          copyarr[9-i] = arr[i];
      }
      for(int i=0;i<10;i++){
          System.out.println(copyarr[i]);
      }

  }
}