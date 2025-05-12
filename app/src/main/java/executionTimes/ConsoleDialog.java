package executionTimes;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class ConsoleDialog {
  private Scanner scanner;
  private volatile int answer;

  public ConsoleDialog(){
    scanner = new Scanner(System.in);
  }

  public void initiateDialog(){
      boolean validInput = false;
      
      while(!validInput){
        System.out.println("Please enter the number to check if it's a prime:");
        try {
          answer = Integer.valueOf(scanner.nextLine());
          validInput = !validInput;
        } catch (NumberFormatException e) {
          System.err.println("Your input is not a valid Number.");
          System.err.println(e.getStackTrace());
          System.out.println();
        } catch (NoSuchElementException e){
          
        }
      }
  }

  public int getInput() throws InterruptedException{
    return answer;
  }
}
