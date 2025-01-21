class Result {
    // Return the minimum number of jumps 
    static int getMinJumps(long n) {
      // Write your code here
       int jump = 0; 
      while(n>0){
        n = n &(n-1);
        jump++;
      }
      return jump;
    }
  }