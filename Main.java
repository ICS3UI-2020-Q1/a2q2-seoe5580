import java.util.Scanner;

/**
 * Allows you to identify with number is bigger
 * @author Eric Seo
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Create a scanner for user input
    Scanner input = new Scanner(System.in);

    // Asks the user to input a number
    System.out.println("Please enter an integer:");

    // gets the number from the user
    int num1 = input.nextInt();

    //Asks the user to input another number
    System.out.println("Please enter another integer:");

    // gets another number from the user
    int num2 = input.nextInt();

    if (num1 > num2){
      System.out.println("The biggest number is " + num1);
      } else {
      System.out.println("The biggest number is " + num2);
    }
    
  }
}
