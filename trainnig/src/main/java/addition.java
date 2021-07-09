import java.util.Scanner;
public class addition {

	public static void main(String[] args) {
		int a,b,sum;
		Scanner inpt = new Scanner(System.in);
		System.out.println("Enter the input value");
		a=inpt.nextInt();
		b = inpt.nextInt();
		sum = a+b;
		System.out.println("Result " + sum);
	}

}
