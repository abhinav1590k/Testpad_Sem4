class Result {
    static int maxElement(int[] arr, int N) {
      // Write Your Code here
          int max = arr[0];
          for(int i=1;i<N;i++){
              if(arr[i]>=max){
                  max = arr[i];
              }
          }
        return max;
    }
  }