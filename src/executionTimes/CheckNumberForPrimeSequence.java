
package executionTimes;


public class CheckNumberForPrimeSequence {
    private ConsoleDialog activeDialog;
    private long number;
    private PrimeNumberChecker checker;

    public CheckNumberForPrimeSequence(){
        this.activeDialog = new ConsoleDialog();
        checker = new PrimeNumberChecker();
        sequence();
        
    }

    public void sequence(){
        activeDialog = new ConsoleDialog();
        // makes a pre-defined Dialog that hides a lot of user input handling
        activeDialog.initiateDialog();
        // returns the int
        number = activeDialog.getInput();
        System.out.println(number + " is " + (checker.isPrime(number)?"":"not ") + "a prime number.");
    }

    

    public static void main(String[] args) {
        new CheckNumberForPrimeSequence();
    }
}
