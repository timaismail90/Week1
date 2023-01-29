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
    System.out.println("The product of the numbers "+num1+" and "+num2+" is = "+(num1+num2));
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
 
