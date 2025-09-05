public class project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int math = 100;
		int physics = 88;
		int chemistry = 69;
			
				final int pass_marks = 45;
		
		int total = math + physics + chemistry;
		double average = total / 3.0;
		
		System.out.println("Average Marks: - " +average);
		
		if(average >= 85) {
			System.out.println("Grade: A");
		}else if (average >= 60) {
			System.out.println("Grade B");
		}else if (average >= pass_marks) {
			System.out.println("Grade C");
		}else {
			System.out.println("Fail");
		}
	}

}
