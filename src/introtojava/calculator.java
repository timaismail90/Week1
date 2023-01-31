package introtojava;
import java.util.Scanner;
public class calculator { 
 public static void main(String[] args) {
  // TODO Auto-generated method stub
  while(true) {
   Scanner scanner = new Scanner(System.in);
   System.out.println("/................Calculator Menu................/\n"
     + "Press 1 for addition\n"
     + "Press 2 for subtraction\n"
     + "Press 3 for Multiplication\n"
     + "Press 4 for Division\n"
     + "Press 5 for finding Square\n"
     + "Press 6 for finding Square root\n"
     + "Press 7 for finding Reciprocal");
   int cal = scanner.nextInt();
   if (cal==1) {
    System.out.println("Enter the first number");
    double num1 = scanner.nextDouble();
    System.out.println("Enter the second number");
    double num2 = scanner.nextDouble();
    System.out.println("The sum of the numbers "+num1+" and "+num2+" is = "+(num1+num2));
    System.out.println("To continue calculation Press 1 else Press any button to exit");
    int exit = scanner.nextInt();
    if (exit == 1) {
     continue;
    }else {
     scanner.close();
     break;
    }
    }
   else if(cal == 2) {
	   System.out.println("Enter the first number");
	   double num1 = scanner.nextDouble();
	    System.out.println("Enter the second number");
	    double num2 = scanner.nextDouble();
	    System.out.println("The subtraction of the numbers "+num1+" and "+num2+" is = "+(num1 - num2));
	    System.out.println("To continue calculation Press 1 else Press any button to exit");
	    int exit = scanner.nextInt();
	    if (exit == 1) {
	     continue;
	    }else {
	     scanner.close();
	     break;
	    }
	   
   }
   else if(cal == 3) {
	   System.out.println("Enter the first number");
	   double num1 = scanner.nextDouble();
	    System.out.println("Enter the second number");
	    double num2 = scanner.nextDouble();
	    System.out.println("The products of the numbers "+num1+" and "+num2+" is = "+(num1 * num2));
	    System.out.println("To continue calculation Press 1 else Press any button to exit");
	    int exit = scanner.nextInt();
	    if (exit == 1) {
	     continue;
	    }else {
	     scanner.close();
	     break;
	    }
	   
   }
   else if(cal == 4) {
	   System.out.println("Enter the first number");
	   double num1 = scanner.nextDouble();
	    System.out.println("Enter the second number");
	    double num2 = scanner.nextDouble();
	    System.out.println("The division of the numbers "+num1+" and "+num2+" is = "+(num1 / num2));
	    System.out.println("To continue calculation Press 1 else Press any button to exit");
	    int exit = scanner.nextInt();
	    if (exit == 1) {
	     continue;
	    }else {
	     scanner.close();
	     break;
	    }
	   
   }
   else if(cal == 5) {
	   System.out.println("Enter the number to find Square");
	   double num = scanner.nextDouble();
	    System.out.println("The square of the number "+num+" is = "+(num * num));
	    System.out.println("To continue calculation Press 1 else Press any button to exit");
	    int exit = scanner.nextInt();
	    if (exit == 1) {
	     continue;
	    }else {
	     scanner.close();
	     break;
	    }
   }
   else if(cal == 6) {
	   System.out.println("Enter the number to find Square root");
	   double num = scanner.nextDouble();
	   double numSquareRoot = Math.pow(num, 0.5);
	    System.out.println("The square root of the number "+num+" is = "+(numSquareRoot));
	    System.out.println("To continue calculation Press 1 else Press any button to exit");
	    int exit = scanner.nextInt();
	    if (exit == 1) {
	     continue;
	    }else {
	     scanner.close();
	     break;
	    }
	   
	   
   } else {
	   System.out.println("Enter the number to find Reciprocal");
	   double num = scanner.nextDouble();
	   double reciprocal = 1/num;
	   System.out.println("The Reciprocal of the number " + num + " is = " + reciprocal);
	   System.out.println("To continue calculation Press 1 else Press any button to exit");
	   int exit = scanner.nextInt();
	    if (exit == 1) {
	     continue;
	    }else {
	     scanner.close();
	     break;
	    }
	   
   }
  }
 }
}
 
