package executionTimes;

public class PrimeNumberChecker {

    long steps;

    public PrimeNumberChecker (){
    }

    public boolean isPrime(long n) {
        //if n is equal to 0 and 1
        if (n == 0 || n == 1){
            steps++;
            return false;
        }
        //if n is equal to 2
        if (n == 2){
            steps++;
            return true;
        }
        //if n is an even number
        if (n % 2 == 0){
            steps++;
            return false;
        }
        //for the rest
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            steps++;
            if (n % i == 0) return false;
        }
        return true;
    }

    public long getSteps(){
        return steps;
    }
    
}


