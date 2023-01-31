package introtojava;
import java.util.Scanner;

public class Pluralizer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a non-negative integer: ");
		int num = scanner.nextInt();
		System.out.println("Enter a singular noun: ");
		String noun = scanner.next();
		String plural = "";
		
		
		scanner.close();
		
		if (num == 1) {
			plural = noun;
		}
		else if(noun.endsWith("s") || noun.endsWith("x") ||noun.endsWith("z") || noun.endsWith("ch") || noun.endsWith("sh")) {
			plural = noun + "es";
		} else if (noun.endsWith("y")) {
			plural = noun.substring(0, noun.length() - 1) + "ies";
		} else if(noun.endsWith("f") || noun.endsWith("fe")) {
			plural = noun.substring(0, noun.length() - 2) + "ves";
		} else if (noun.endsWith("o")) {
			plural = noun + "es";
		} else if (noun.endsWith("us")) {
			plural = noun.substring(0, noun.length() - 2) + "i";
		} else {
			plural = noun + "s";
		}
		System.out.println( num + " " + plural);

	}

}
