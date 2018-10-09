package roomGenerator;
import java.util.*;

public class RoomGen {
	
	public static void main(String[]args){
		
		double l;
		double w;
		double h;
		double area;
		double volume;
		String keepGoing;

			do {
				
			
			Scanner scanner = new Scanner(System.in);

			
			System.out.println("Welcome to Grand Circus' Room Detail Generator!");
			
			System.out.println(); //Leaving extra line between welcome and first input
			
			System.out.println("Enter the length of your room: "); 
			l = scanner.nextDouble(); 	 //Get room length
			
			
			
			System.out.println("Enter the width of your room: "); 
			w= scanner.nextDouble();	 //Get room width
			
			System.out.println("Enter the height of your room: "); 
			h = scanner.nextDouble(); 	 //Get room height 
			
			area = l * w;
			volume = l * w * h;
			
			double perimeter = (area * 2);
			
			System.out.println("Room area is: " + area);
			System.out.println("Room perimeter is: " + perimeter);
			System.out.println("Room perimeter is: " + volume);
			
			
			System.out.println("Continue? Y/N");
			keepGoing = scanner.next();
			
	

			}
			
			while(keepGoing.equals("Y"));
	}
	
}