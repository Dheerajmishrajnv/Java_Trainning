import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
		Scanner inputObj = new Scanner(System.in);
		int number = inputObj.nextInt();
		float squareRootNumber = (float) Math.sqrt(number);
		System.out.println(squareRootNumber);

	}

}
