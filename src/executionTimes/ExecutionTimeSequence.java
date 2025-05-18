package executionTimes;

public class ExecutionTimeSequence {
  private final ExecutionTimeTester benchmarker;

  public static void main(String[] args) {
    new ExecutionTimeSequence();
  }

  public ExecutionTimeSequence(){
    benchmarker = new ExecutionTimeTester(300);
    testSequence();
  }

  public void testSequence(){
    float executionTime;
    long steps;

    executionTime= benchmarker.measureFunctionTime((n)->{return codeSnippet1(n);});
    steps = benchmarker.getSteps();
    System.out.println("Code 1 ran with a time of "+executionTime+" ms in "+steps+" steps.");
    executionTime= benchmarker.measureFunctionTime((n)->{return codeSnippet2(n);});
    steps = benchmarker.getSteps();
    System.out.println("Code 2 ran with a time of "+executionTime+" ms in "+steps+" steps.");
    executionTime= benchmarker.measureFunctionTime((n)->{return codeSnippet3(n);});
    steps = benchmarker.getSteps();
    System.out.println("Code 3 ran with a time of "+executionTime+" ms in "+steps+" steps.");
    executionTime= benchmarker.measureFunctionTime((n)->{return codeSnippet4(n);});
    steps = benchmarker.getSteps();
    System.out.println("Code 4 ran with a time of "+executionTime+" ms in "+steps+" steps.");
    executionTime= benchmarker.measureFunctionTime((n)->{return codeSnippet5(n);});
    steps = benchmarker.getSteps();
    System.out.println("Code 5 ran with a time of "+executionTime+" ms in "+steps+" steps.");
    executionTime= benchmarker.measureFunctionTime((n)->{return codeSnippet6(n);});
    steps = benchmarker.getSteps();
    System.out.println("Code 6 ran with a time of "+executionTime+" ms in "+steps+" steps.");
    executionTime= benchmarker.measureFunctionTime((n)->{return codeSnippet7(n);});
    steps = benchmarker.getSteps();
    System.out.println("Code 7 ran with a time of "+executionTime+" ms in "+steps+" steps.");
    executionTime= benchmarker.measureFunctionTime((n)->{return codeSnippet8(n);});
    steps = benchmarker.getSteps();
    System.out.println("Code 8 ran with a time of "+executionTime+" ms in "+steps+" steps.");
  }

  private long codeSnippet1 (long n){
    long sum = 0;
      for (long i = 0; i < n; i++){
        sum++;
      }
    return sum;
  }

  private long codeSnippet2 (long n){
    long sum = 0;
      for ( long i = 0; i < n; i ++){
        for ( long j = 0; j < n; j ++){
          sum++;
        }
      }
    return sum;
  }

  private long codeSnippet3 (long n){
     long sum = 0;
    for ( long i = 0; i < n; i ++){
      for ( long j = i; j < n; j ++){
        sum++;
      }
    }
    return sum;
  }

  private long codeSnippet4 (long n){
    long sum = 0;
    for ( long i = 0; i < n; i ++){
      sum ++;
      for ( long j = 0; j < n; j ++){
        sum ++;
      }
    }
    return sum;
  }

  private long codeSnippet5 (long n){
    long sum = 0;
    for ( long i = 0; i < n; i ++){
      for ( long j = 0; j < n*n; j ++){
        sum++;
      }
    }
    return sum;
  }

    private long codeSnippet6 (long n){
    long sum = 0;
    for ( long i = 0; i < n; i ++){
      for ( long j = 0; j < i; j ++){
        sum++;
      }
    }
    return sum;
  }

    private long codeSnippet7 (long n){
    long sum = 0;
    for ( long i = 1; i < n; i ++){
      for ( long j = 0; j < n*n; j ++){
        if (j % i == 0){
          for (long k = 0; k < j; k++){
            sum++;
          }
        }
      }
    }
    return sum;
  }

    private long codeSnippet8 (long n){
    long sum = 0;
    long i = n;
    while (i > 1) {
        i = i / 2;
        sum++;
    }
    return sum;
  }
}
