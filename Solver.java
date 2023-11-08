import java.util.Scanner;
import java.text.DecimalFormat;
/**
*This program solves for.
*the result of a specified
*expression.
*@author Caroline Kirkconnell
*@version 1/29/2020
*/
public class Solver {
/**
*Calculates the result of the.
*expression in the formula below
*for a value x of type double.
*
*@param args Command-line arguments (unused).
*/
   public static void main(String[] args) {
      double x, calculationOne, calculationTwo, calculationThree,
         result, numberToLeft, numberToRight, formattedResult;
   
      Scanner scan = new Scanner(System.in);
   
   //User enters value for x:
      System.out.print("Enter a value for x: ");
      x = scan.nextDouble();
   
   //System prints unformatted result:
      calculationOne = (11 * Math.pow(x, 4) + 9 * Math.pow(x, 3) 
                  + 7 * Math.pow(x, 2) + 5 * x + 4);
      calculationTwo = Math.abs(calculationOne);
      calculationThree = Math.sqrt(calculationTwo);
      result = calculationThree / (2 * x + 4);
      System.out.println("Result: " + result);
      String resultStr = Double.toString(result);
   
   //System prints number of characters to the left of the decimal point.
      int dotPos = resultStr.indexOf('.'); 
      //locate decimal point in expression result
      int leftLength = dotPos;
      int right = ((resultStr.length() - dotPos) - 1);
      System.out.println("# of characters to left of decimal point: "
                + dotPos);
      String numbertoleft = Double.toString(result);
   
   //System prints number of characters to the right of the decimal point.
      System.out.println("# of characters to right of decimal point: "
                + right);
      String numbertoright = Double.toString(result);
   
   //Now, format the value of the expression
   //using an instance of the DecimalFormat class.
      DecimalFormat dF = new DecimalFormat("#,##0.0####");
      System.out.println("Formatted Result: "
         + dF.format(result));
   
   }
}
