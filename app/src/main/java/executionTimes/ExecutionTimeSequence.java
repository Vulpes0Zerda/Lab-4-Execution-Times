package executionTimes;

public class ExecutionTimeSequence {
  private ExecutionTimeTester benchmarker;

  public ExecutionTimeSequence(){
    benchmarker = new ExecutionTimeTester(1000000);
  }

  public void testSequence(){
    benchmarker.measureFunctionTime((n)->{return codeSnippet1(n);});
    benchmarker.measureFunctionTime((n)->{return codeSnippet2(n);});
    benchmarker.measureFunctionTime((n)->{return codeSnippet3(n);});
    benchmarker.measureFunctionTime((n)->{return codeSnippet4(n);});
    benchmarker.measureFunctionTime((n)->{return codeSnippet5(n);});
    benchmarker.measureFunctionTime((n)->{return codeSnippet6(n);});
    benchmarker.measureFunctionTime((n)->{return codeSnippet7(n);});
    benchmarker.measureFunctionTime((n)->{return codeSnippet8(n);});
  }

  private int codeSnippet1 (int n){
    int sum = 0;
      for (int i = 0; i < n; i++){
        sum++;
      }
    return sum;
  }

  private int codeSnippet2 (int n){
    int sum = 0;
      for ( int i = 0; i < n; i ++){
        for ( int j = 0; j < n; j ++)
          sum++;
      }
    return sum;
  }

  private int codeSnippet3 (int n){
    int sum = 0;
    for ( int i = 0; i < n; i ++){
      for ( int j = i; j < n; j ++)
        sum++;
    }
    return sum;
  }

  private int codeSnippet4 (int n){
    int sum = 0;
    for ( int i = 0; i < n; i ++){
      sum ++;
      for ( int j = 0; j < n; j ++){
        sum ++;
      }
    }
    return sum;
  }

  private int codeSnippet5 (int n){
    int sum = 0;
    for ( int i = 0; i < n; i ++){
      for ( int j = 0; j < n*n; j ++)
      sum++;
    }
    return sum;
  }

    private int codeSnippet6 (int n){
    int sum = 0;
    for ( int i = 0; i < n; i ++){
      for ( int j = 0; j < i; j ++)
        sum++;
    }
    return sum;
  }

    private int codeSnippet7 (int n){
    int sum = 0;
    for ( int i = 1; i < n; i ++){
      for ( int j = 0; j < n*n; j ++)
        if (j % i == 0)
            for (int k = 0; k < j; k++)
              sum++;
    }
    return sum;
  }

    private int codeSnippet8 (int n){
    int sum = 0;
    int i = n;
    while (i > 1) {
        i = i / 2;
        sum++;
    }
    return sum;
  }
}
