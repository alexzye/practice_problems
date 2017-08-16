import java.util.*;

public class LargestPrimeFactor {

  static void largestPrimeFactor(long x) {

    List<Integer> factors = new ArrayList<>();

    for(int i=2; i<x; i++) {
      while(x % i == 0 && !factors.contains(i)) {
        factors.add(i);
      }
    }

    if(factors.isEmpty()) {
      // factors.add((int) x);
    }

    System.out.println(Collections.max(factors));
  }

  public static void main(String[] args) {
    // BigInteger big = new BigInteger("600851475143");
    largestPrimeFactor(600851475143);
  }

}
