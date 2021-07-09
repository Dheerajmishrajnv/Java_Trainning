import java.util.Scanner;

public class TempConverter {

	public static void main(String[] args) {
		Scanner inputObj = new Scanner(System.in);
		int fahrenheit = inputObj.nextInt();
		float celcius = (5/9)*(fahrenheit-32);
		System.out.println(celcius);
	}

}
