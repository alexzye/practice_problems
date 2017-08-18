// Problem 5
// Solution not optimal
class SmallestMultiple {

  static Boolean isEvenMultiple(int x) {
    for(int j = 1; j <= 20; j++) {
      if(x % j != 0) {
        return false;
      }
    }
    return true;
  }
  // O(n + m) where m has max of 19 iterations
  static int SmallestMultiple() {
    int x = 40;
    while(!isEvenMultiple(x)) {
      x += 20;
    }

    return x;
  }

  public static void main(String[] args) {
    System.out.println(SmallestMultiple());
  }
}
