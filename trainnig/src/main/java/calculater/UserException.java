package calculater;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UserException {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Imput value");
			String a = br.readLine();
			int first = Integer.parseInt(a);
			String b = br.readLine();
			int second = Integer.parseInt(b);
			Calculater c = new Calculater();
			int result = c.add(first, second);
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
