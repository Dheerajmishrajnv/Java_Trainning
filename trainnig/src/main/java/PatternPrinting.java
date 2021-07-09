import java.util.*;

public class PatternPrinting {

	public static void main(String[] args) {
		Scanner inputObj = new Scanner(System.in);
		int row = inputObj.nextInt();
		int i, j;
		for (i = 1; i <= row; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
