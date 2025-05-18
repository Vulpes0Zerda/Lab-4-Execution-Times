package executionTimes;

import java.util.Random;

public class PrimeNumberSequence {

  private ExecutionTimeTester tester;
  public static void main(String[] args) {
    new PrimeNumberSequence();
  }

  public PrimeNumberSequence(){
    tester = new ExecutionTimeTester(100);
    float runtime20Bits = tester.measureFunctionTime((n)->{return runRandomPrimeNumberCheck(n, 524288L);});
    long steps20Bits = tester.getSteps();
    float runtime40Bits = tester.measureFunctionTime((n)->{return runRandomPrimeNumberCheck(n, 549755813888L);});
    long steps40Bits = tester.getSteps();
    System.out.println("The 20 bit numbers required "+steps20Bits+ " to complete and took "+ runtime20Bits + " ms.");
    System.out.println("The 40 bit numbers required "+steps40Bits+ " to complete and took "+ runtime40Bits + " ms.");
    System.out.println("The "+(runtime20Bits<runtime40Bits?"40 ":"20 ")+"bit numbers took longer.");
    System.out.println("The "+(steps20Bits<steps40Bits?"40 ":"20 ")+"bit numbers took more steps to complete.");
  }
  
  /**
   * Runs a PrimeNumber.isPrime() check on random numbers within bound n times
   * @param n
   */
  public long runRandomPrimeNumberCheck (long n, long lowerBound){
    long sum = 0;
    for (int i = 0; i < n; i++) {
      long randomLong = lowerBound - getRandomLong(lowerBound);
      PrimeNumberChecker primeNumber = new PrimeNumberChecker();
      System.out.println(randomLong + " is "+(primeNumber.isPrime(randomLong)?"":"not ")+ "a prime number.");
      System.out.println("This process took "+ primeNumber.getSteps() + " steps.");
      sum += primeNumber.getSteps();
    }
    return sum;
  }

  private long getRandomLong(long randomLowerBound){
    Random random = new Random();
    return random.nextLong(randomLowerBound);
  }
}
