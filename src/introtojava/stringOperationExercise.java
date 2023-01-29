package introtojava;
import java.util.Scanner;
public class stringOperationExercise { 
 public static void main(String[] args) {
  // TODO Auto-generated method stub
  while(true) {
   Scanner scanner = new Scanner(System.in);
   System.out.println("/................String Menu................/\n"
     + "Press 1 for Palindrome Check\n"
     + "Press 2 to reverse a String\n"
     + "Press 3 to Concatenate two Strings\n"
     + "Press 4 for String Comparison\n"
     + "Press 5 to Calculate the Length of String\n"
     + "Enter the option:");
   int option = scanner.nextInt();
   if (option == 1) {
	   System.out.println("Palindrome Check");   
    System.out.println("Enter a string:");
    
    String input = scanner.next();
    String reverseInput = "";

    //Kayak
    for(int i = input.length() - 1; i >= 0; i--) {
        reverseInput += input.charAt(i);
    }

    if(input.equals(reverseInput)) {
        System.out.println("String is palindrome");
    } else {
        System.out.println("String is not a palindrome");
    }

  
    System.out.println("To continue calculation Press 1 else Press any button to exit");
    int exit = scanner.nextInt();
    if (exit == 1) {
     continue;
    }else {
     scanner.close();
     break;
    }
    }
   else if(option == 2) {
	   System.out.println("Enter a string to reverse");
	   String input = scanner.next();
	   String reverseInput = "";
	   for(int i = input.length() - 1; i >= 0; i--) {
	        reverseInput += input.charAt(i);
	    }
	   
	   System.out.println( reverseInput +  " is the reversed of " + input);
	   System.out.println("To continue calculation Press 1 else Press any button to exit");
	    int exit = scanner.nextInt();
	    if (exit == 1) {
	     continue;
	    }else {
	     scanner.close();
	     break;
	    }
	   
   }
   else if(option == 3) {
	   System.out.println("String Concatenation");
	   System.out.println("Enter First string:");
	   String input1 = scanner.next();
	   System.out.println("Enter Second string:");
	   String input2 = scanner.next();
	   String output = input1.concat(input2);
	   System.out.println("The concatenated string is: " + output);
	   System.out.println("To continue calculation Press 1 else Press any button to exit");
	    int exit = scanner.nextInt();
	    if (exit == 1) {
	     continue;
	    }else {
	     scanner.close();
	     break;
	    } 
   }
   else if(option == 4) {
	   System.out.println("String Comparison");
	   System.out.println("Enter First string:");
	   String input1 = scanner.next();
	   System.out.println("Enter Second string:");
	   String input2 = scanner.next();
	   if(input1.equals(input2)) {
		   System.out.println("The entered strings are equal");
	   } else {
		   System.out.println("The entered strings are not equal");
	   }
	   System.out.println("To continue calculation Press 1 else Press any button to exit");
	    int exit = scanner.nextInt();
	    if (exit == 1) {
	     continue;
	    }else {
	     scanner.close();
	     break;
	    } 
	   
   }
   else {
	   System.out.println("Length of a string");
	   System.out.println("Enter a string:");
	   String input = scanner.next();
	   int output = input.length();
	   System.out.println("The length of the entered string is: " + output);
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
