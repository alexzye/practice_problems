class LargestPalindromeProduct {
  static Boolean isPalindrome(int n) {
    if(n < 0 || (n != 0 && n %10 == 0)) return false;

    int rev = 0;

    while(n > rev) {
      rev = rev * 10 + n % 10;
      n /= 10;
    }

    return (n==rev || n == rev/10);
  }

  // O(n^2) algorithm
  // O(1) space
  static int largestPalindromeProduct() {
    int max = 0;

    for(int i = 999; i>= 100; i--) {
      for(int j = i; j >= 100; j--) {
        if(isPalindrome(i * j) && i * j > max) {
          max = i*j;
        }
      }
    }
    return max;
  }

  public static void main(String[] args) {
    System.out.println(largestPalindromeProduct());
  }
}
