import java.util.Scanner;
// Other imports go here, Do NOT change the class name
class Main
{
  public static void main(String[] args)
  {
    // Write your code here
      Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        while (T-- > 0) {
            int N = sc.nextInt();
            int[][] arr = new int[N][N];
            
            // Reading the matrix
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            
            for (int i = 0; i < N; i++) {
                for (int j = i + 1; j < N; j++) {
                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
                }
            }
            
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N / 2; j++) {
                    int temp = arr[i][j];
                    arr[i][j] = arr[i][N - 1 - j];
                    arr[i][N - 1 - j] = temp;
                }
            }
            
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    System.out.print(arr[i][j]);
                    if (j < N - 1) {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            System.out.println();
        }

  }
}