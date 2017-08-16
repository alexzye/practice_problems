public class Fibonacci {

  // Even only terms
  static void itFib (int n) {
    int a = 0,b = 1,c = 2, accumulator = 0;

    for(int i=1; a<n; i++)
    {
      if(a % 2 == 0) {
        accumulator += a;
      }
      c=a+b;
      a=b;
      b=c;
    }
    System.out.println(accumulator);
  }

  
  public static void main(String[] args) {
    itFib(4000000);

  }
}
