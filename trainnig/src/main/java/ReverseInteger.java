import java.util.Scanner;
public class ReverseInteger {

	public static void main(String[] args) {
		Scanner inputObj = new Scanner(System.in);
		int number = inputObj.nextInt(), reverse = 0;
		String store = new String();
		while(number!=0) {
			int reminder = number%10;
			reverse = reverse*10+reminder;
			number = number/10;
		}
		System.out.println(reverse);
	}

}
