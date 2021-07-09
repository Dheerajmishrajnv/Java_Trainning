package calculater;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ExceptionHandling {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Imput value");
		String a = br.readLine();
		int first = Integer.parseInt(a);
		String b = br.readLine();
		int second = Integer.parseInt(b);
		Calculater c = new Calculater();
		int result = c.add(first, second);
		System.out.println(result);
	}

}
