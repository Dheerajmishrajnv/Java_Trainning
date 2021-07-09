import java.util.Scanner;
public class PrimeCheck {

	public static void main(String[] args) {
		Scanner inputObj = new Scanner(System.in);
		int number = inputObj.nextInt();
		for(int i = 2; i<=Math.sqrt(number);i++) {
			if(number%i==0) {
				System.out.println("The number is not a prime number");
				break;
			}
			else {
				System.out.println("The number is prime number");
				break;
			}
		}

	}

} 
