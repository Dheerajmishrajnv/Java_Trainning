import java.util.*;

public class AreaCircle {

	public static void main(String[] args) {
		Scanner inputObj = new Scanner(System.in);
		System.out.println("Enter the redius");
		int redius = inputObj.nextInt();
		float area = redius * redius * 3.14f;
		System.out.println(area);
	}

}
