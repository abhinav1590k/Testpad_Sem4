class Result{
    static int toggleExceptKthBit(int n,int k){
      // Write your code here
        int bitmask = 1<<k;
        int toggleall = ~(n);
        int newNumber = bitmask ^ toggleall;
        return newNumber;
    }
  }