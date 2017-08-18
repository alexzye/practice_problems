// Problem 7
class NthPrime {
  // O(n) time
  // O(1) space
  static Boolean isPrime(int n) {
    if(n <= 1) {
      return false;
    } else if(n <= 3) {
      return true;
    } else if(n % 2 == 0 || n % 3 == 0) {
      return false;
    }

    int i = 5;

    while(i * i <= n) {
      if(n % i == 0 || n % (i + 2) == 0) {
        return false;
      }
      i += 6;
    }

    return true;
  }
  // O(n) time
  // O(1) space
  static int nthPrime(int n) {
    int count = 1;
    int i = 1;
    while(count != n) {
      i+=2;
      if(isPrime(i)) {
        count++;
      }
    }
    return i;
  }

  public static void main(String[] args) {
    System.out.println(nthPrime(10001));

  }
}
