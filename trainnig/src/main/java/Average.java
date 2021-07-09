import java.util.*;

public class Average {

	public static void main(String[] args) {
		Scanner inputObj = new Scanner(System.in);
		int inputNumbers = inputObj.nextInt();
		int[] arrayNumber = new int[inputNumbers];
		int sum = 0;
		for (int i = 0; i < inputNumbers; i++) {
			int value = inputObj.nextInt();
			arrayNumber[i] = value;
		}
		for (int i = 0; i < arrayNumber.length; i++) {
			sum = sum + arrayNumber[i];
		}
		int result = sum / arrayNumber.length;
		System.out.println(result);
	}

}
