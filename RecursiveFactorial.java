import java.util.Scanner;

public class RecursiveFactorial {

  public static int Factorial(int num) {
    if (num == 0 || num == 1) {
      return 1;
    } else {
      return Factorial(num - 1) * num;
    }
  }

  public static void main(String[] args) throws Exception {
    Scanner myObj = new Scanner(System.in);
    int number = 0;
    System.out.println("Enter a number");
    while (true) {
	    String numberStr = myObj.nextLine();
	    try {
	      number = Integer.parseInt(numberStr);
      } catch (NumberFormatException e) {
        System.out.print("Invlaid input");
      }
    
      if (number >= 0) {
        System.out.println("The factorial of " + number + " is " + Factorial(number));
        break;
      } else {
        System.out.print("Enter a valid number \n");
      }
    }
  }
}