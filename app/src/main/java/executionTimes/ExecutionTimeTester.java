package executionTimes;


import java.util.function.Function;


public class ExecutionTimeTester {
    private long time;
    private int sum = 0;
    private int n = 1000000;

    public ExecutionTimeTester(int n){
        this.n = n;
    }
        
    private void startTimeMeasurement(){
        time = System.nanoTime();
    }

    private long stopTimeMeasurement() throws NullPointerException{
        if(time == 0){
            throw new NullPointerException("Variable 'time' cannot be unintitialized.");
        }
        long tempTime = System.nanoTime() - time;
        time= 0;
        return tempTime;
    }


    /**
     * Method to measure runtime of a function that runs its loop n times and returns the time in ms as a long
     * 
     * @param    function  a function that takes an integer and runs itself for that number of times and returns an int of its steps
     * @return             the time measured in ms (2 decimal places) as a float
     */
    public float measureFunctionTime (Function<Integer, Integer> func) {
        sum = 0;
        startTimeMeasurement();
        try {
            sum = func.apply(n);
        } catch (Exception e) {
            System.err.println("Function was not able to execute correctly");
            System.err.println(e.getStackTrace());
        }
        return (float) (Math.round(stopTimeMeasurement()/10000))/100;
    }

    public int getSteps(){
        return sum;
    }

}
