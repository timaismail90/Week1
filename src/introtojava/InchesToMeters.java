package introtojava;
import java.util.Scanner;

public class InchesToMeters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input a value to be converted to meters:");
		String input = scanner.nextLine();
		scanner.close();
		double doubledInput = Double.parseDouble(input);
		
		System.out.println( doubledInput +" inches equals to " + (doubledInput * 0.0254) + " meters");
				

	}

}
