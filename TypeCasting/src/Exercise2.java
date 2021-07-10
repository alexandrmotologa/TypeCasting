
public class Exercise2 {
	
	public static void main(String[] args) {
		//DATA
		
		int distanceBetweenCitiesMiles = 200;
		int speedCarKm = 160;
		
		
		//CALCULATIONS
		
		//Convert miles to km
		double distanceBetweenCitiesKm = distanceBetweenCitiesMiles * 1.60;
		
		//Calculations time on the road
		int hourOnRoad = (int)distanceBetweenCitiesKm / speedCarKm;
		int minutesOnRoad = (int)distanceBetweenCitiesKm % speedCarKm;
		
		//PRINT RESULTS
		
		System.out.printf("The road takes %dh %dm", hourOnRoad, minutesOnRoad );

	}
}
