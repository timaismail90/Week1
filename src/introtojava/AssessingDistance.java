package introtojava;
import java.util.Scanner;

public class AssessingDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input distance in meters:");
		double distanceInMeters = scanner.nextDouble();
		System.out.println("Input hour:");
		double hour = scanner.nextDouble();
		System.out.println("Input minutes:");
		double minutes = scanner.nextDouble();
		System.out.println("Input seconds:");
		double seconds = scanner.nextDouble();
		
		scanner.close();
		
		double speedInmPerS = distanceInMeters/((hour * 60 * 60) + (minutes * 60) + seconds);
		double speedInkmPerHr = (distanceInMeters/1000)/(hour + (minutes/60) + (seconds/3600));
		double speedInMilesPerHr = (distanceInMeters/16092500
				)/(hour + (minutes/60) + (seconds/3600));
		System.out.println("Your speed in meters/second is " + (float)speedInmPerS);
		System.out.println("Your speed in km/h is is " + (float)speedInkmPerHr);
		System.out.println("Your speed in miles/h  is " + (float)speedInMilesPerHr);
			

	}

}
