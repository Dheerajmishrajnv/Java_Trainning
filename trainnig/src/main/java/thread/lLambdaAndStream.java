package thread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class lLambdaAndStream {
	public static void main(String[] args) throws IOException {
		List<Integer> l = new ArrayList<Integer>(0);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String a = br.readLine();
		int inputValue = Integer.parseInt(a);
		for(int i=0;i<inputValue;i++) {
			String b = br.readLine();
			int value = Integer.parseInt(b);
			l.add(value);
		}
		l.forEach(e->{
			System.out.println(e);
		});
		l.stream().filter(n-> n%2 == 0).map(e->Math.sqrt(e)).forEach(System.out::println);
	}
}

