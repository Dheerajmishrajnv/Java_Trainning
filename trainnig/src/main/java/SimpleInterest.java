import java.util.*;

public class SimpleInterest {

	public static void main(String[] args) {
		Scanner inputObj = new Scanner(System.in);
		int amount = inputObj.nextInt();
		int rate = inputObj.nextInt();
		int time = inputObj.nextInt();
		float interest = (amount * rate * time) / 100;
		System.out.println(interest);

	}

}
