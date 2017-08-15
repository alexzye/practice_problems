public class MultiplesOfThree {


  public static void main(String[] args) {
    int accumulator = 0;
    for(int i = 0; i<1000; i++) {
      if(i % 3 == 0) {
        accumulator += i;
      } else if(i % 5 == 0) {
        accumulator += i;
      }
    }
    System.out.println(accumulator);
  }
}
