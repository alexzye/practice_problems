// Problem 6
class SumSquareDifference {
  // O(n) time
  // O(1) space
  // this solution is limited
  static int sumSquareDifference(int n) {
    int sumOfSquare = 0;
    int squareOfSum = 0;
    for(int i = 1; i <= n; i++) {
      sumOfSquare += Math.pow(i, 2);
      squareOfSum += i;
    }

    squareOfSum = (int)Math.pow(squareOfSum, 2);

    return squareOfSum - sumOfSquare;
  }

  // Optimized
  // O(1) time
  // O(1) space
  // Capped by MAX_INTEGER
  static int sumSquareDifferenceOpt(int n) {
    int limit = n;
    int sum = (limit * (limit + 1)) / 2;
    int sum_sq = ((2 * limit + 1) * (limit + 1) * limit) / 6;

    return (int)Math.pow(sum, 2) - sum_sq;
  }

  public static void main(String[] args) {
    System.out.println(sumSquareDifferenceOpt(100));
  }
}
