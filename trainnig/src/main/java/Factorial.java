import java.util.*;

public class Factorial {
	public static void main(String[] args) {
		Scanner inputObj = new Scanner(System.in);
		int number = inputObj.nextInt();
		int result=1;
		if(number == 0) {
			System.out.println(1);
		}
		else {
		for(int i =number;i>=1;i--) {
			result = result*i ;
		}}
		System.out.println(result);
	}}
