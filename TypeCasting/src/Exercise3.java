
public class Exercise3 {

	public static void main(String[] args) {
		
		//DATA
		
		//student
		int studentTheoryHours = 100;
		int studentSuccessfulExcercises = 75;
		int studentCertificationExam = 8;
		
		//for certified
		final int MINIMUM_THEORY_HOURS_ACCEPTED = 100;
		final int TOTAL_EXERCISES = 120;
		final int MINIMUM_EXERCISES = (TOTAL_EXERCISES * 70) / 100;
		final int MINIMIMAL_GRADE = 7;
		
		//CALCULATIONS
		
		boolean certified = studentTheoryHours >= MINIMUM_THEORY_HOURS_ACCEPTED && studentSuccessfulExcercises >= MINIMUM_EXERCISES && 
				studentCertificationExam >= MINIMIMAL_GRADE;
		
		//PRINT RESULTS		
		if (certified == true){
			System.out.println("Certified true!");
		}else {
			System.out.println("Certified false!");
		}
		
		
	}

}
