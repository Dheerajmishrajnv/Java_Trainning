import java.util.Scanner;

public class CompoundInterest {

	public static void main(String[] args) {
		Scanner inputObj = new Scanner(System.in);
		int amount = inputObj.nextInt();
		int rate = inputObj.nextInt();
		int time = inputObj.nextInt();
		float interest = (float) (amount * Math.pow(1 + (rate / 100), time));
		System.out.println(interest);

	}

}
