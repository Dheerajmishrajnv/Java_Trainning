package calculater;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultipleException {
	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Input value");
			String a = br.readLine();
			int first = Integer.parseInt(a);
			String b = br.readLine();
			int second = Integer.parseInt(b);
			if (first < 2) {
				throw new MyException();
			}
			Calculater c = new Calculater();
			int result = c.add(first, second);
			System.out.println(result);
			System.out.println(c.div(first, second));
		} catch (IOException e1) {
			e1.printStackTrace();
		} catch (ArithmeticException e2) {
			e2.printStackTrace();

		} catch (MyException e3) {
			e3.printStackTrace();
		}
	}
}
