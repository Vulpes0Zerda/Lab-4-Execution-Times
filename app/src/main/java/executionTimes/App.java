
package executionTimes;

public class App {
    private ConsoleDialog activeDialog;
    private int number;

    public App(){
        this.activeDialog = new ConsoleDialog();
        run();
    }

    public void run(){
        activeDialog = new ConsoleDialog();
        // makes a pre-defined Dialog that runs in a Thread will re-syncronize when awaitAnswer is called.
        activeDialog.initiateDialog();
        try {
            // waits for the Thread to finish and returns the int
            // enter the code to the prime checker (pref a class) here
            // you can also just use awaitAnswer as a variable
            number = activeDialog.awaitAnswer();
        } catch (InterruptedException e) {
            System.err.println("The Thread was interrupted.");
            System.err.println(e.getStackTrace());

        }

    }

    public static void main(String[] args) {
        new App();
    }
}
