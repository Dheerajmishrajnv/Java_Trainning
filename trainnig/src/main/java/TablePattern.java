import java.util.*;

public class TablePattern {

	public static void main(String[] args) {
		Scanner inputObj = new Scanner(System.in);
		int row = inputObj.nextInt();
		for(int i=1;i<=row;i++) {
			for(int j = 0;j<i;j++) {
				System.out.print(i*j + "  ");
			}
			System.out.println();
		}

	}

}
