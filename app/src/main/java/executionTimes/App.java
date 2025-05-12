
package executionTimes;


public class App {
    private ConsoleDialog activeDialog;
    private int number;

    public App(){
        this.activeDialog = new ConsoleDialog();
        sequence();
    }

    public void sequence(){
        activeDialog = new ConsoleDialog();
        // makes a pre-defined Dialog that hides a lot of user input handling
        activeDialog.initiateDialog();
        try {
            // returns the int
            // enter the code to the prime checker (pref a class) here
            // you can also just use awaitAnswer as a variable
            number = activeDialog.getInput();
        } catch (InterruptedException e) {
            System.err.println("The Thread was interrupted.");
            System.err.println(e.getStackTrace());

        }

    }

    public static void main(String[] args) {
        new App();
    }
}
