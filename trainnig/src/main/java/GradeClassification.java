import java.util.Scanner;

public class GradeClassification {

	public static void main(String[] args) {
		Scanner inputObj = new Scanner(System.in);
		System.out.println("Please input the grade");
		int grade = inputObj.nextInt();
		if (grade > 90) {
			System.out.println("The grade is A+");
		} else if (grade > 80) {
			System.out.println("The grade is A");
		} else if (grade > 70) {
			System.out.println("The grade is B+");
		} else if (grade > 60) {
			System.out.println("The grade is B");
		} else {
			System.out.println("The grade is Elite");
		}
	}

}
