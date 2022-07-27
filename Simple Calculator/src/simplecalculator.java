import java.util.*;
public class simplecalculator {

	public static void main(String[] args) {
		System.out.println("simple calculator");
		   
		char operator;
	    Double n1, n2, result;
	    Scanner input = new Scanner (System.in);
	    System.out.println("Enter num1:");
	    n1 = input.nextDouble();

	    System.out.println("Enter num2:");
	    n2 = input.nextDouble();
	    System.out.println("Choose an operator: +, -, *,/");
	    operator = input.next().charAt(0);

	    switch (operator) {

	      
	      case '+':
	        result = n1 + n2;
	        System.out.println(n1 + " + " + n2 + " = " + result);
	        break;

	      
	      case '-':
	        result = n1 - n2;
	        System.out.println(n1 + " - " + n2 + " = " + result);
	        break;

	     
	      case '*':
	        result = n1 * n2;
	        System.out.println(n1 + " * " + n2 + " = " + result);
	        break;

          case '/':
	        result = n1 / n2;
	        System.out.println(n1 + " / " + n2 + " = " + result);
	        break;

	      default:
	        System.out.println("Invalid operator!");
	        break;
	    }

	    
	}
}
		   
		