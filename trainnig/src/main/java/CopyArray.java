import java.util.Scanner;

public class CopyArray {

	public static void main(String[] args) {
		Scanner inputObj = new Scanner(System.in);
		int number = inputObj.nextInt();
		int[] actualValue = new int[number];
		int[] copiedValue = new int[number];
		System.out.println("Enter the value");
		for (int i = 0; i < number; i++) {
			actualValue[i] = inputObj.nextInt();
		}
		for (int i = 0; i < number; i++) {
			copiedValue[i] = actualValue[i];
		}
		for (int i = 0; i < number; i++) {
			System.out.println(copiedValue[i]);
		}

	}

}
