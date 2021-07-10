
public class Exercise1 {

	public static void main(String[] args) {
		
		//Students Grades
		
		int yearOne = 10;
		int yearTwo = 9;
		int yearThree = 8;
		int yearFour = 10;
		int yearFive = 9;

		//CALCULATIONS
		
		double averageGrade = (double)(yearOne + yearTwo + yearThree + yearFour + yearFive ) / 5;
		
		//PRINT RESULTS
		
		System.out.printf("Your average grade is %5.2f", averageGrade);
	}

}
