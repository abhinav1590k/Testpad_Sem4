class Result {
    public static int findOddMan(int n, int arr[]) {
      // Write your code here
  int count =1;
      Arrays.sort(arr);
      for(int i=1;i<n;i++){
        if(arr[i] == arr[i-1]){
          count++;
        }
        else{
          if(count%2!=0){
            return arr[i-1];
          }
          count =1;
        }
      }
        if(count%2!=0){
            return arr[n-1];
        }
      return -1;
    }
  }