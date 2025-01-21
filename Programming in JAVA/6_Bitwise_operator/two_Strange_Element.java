import java.util.*;
class Result{
  static void printStrangeElements(int[] arr, int n) {
    // Write your code here
          int result = 1;
     Arrays.sort(arr);
    for (int i = 1; i < n; i++) {
      if (arr[i] == arr[i - 1]) {
        result++;
      } else {
        if (result % 2 != 0) {
          System.out.print(arr[i - 1] + " ");
        }
        result = 1;
      }
    }
    if (result % 2 != 0) {
      System.out.print(arr[n - 1] + " ");
    }
  }
}