package interfaceandarray;

import java.util.*;

public class Solution {

	public static void main(String[] args) {
		int c[] = new int[5];
		Scanner inputObj = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			c[i] = inputObj.nextInt();
		}
		for (int element : c) {
			System.out.println(element);
		}
		InterfaceImpl obj = new InterfaceImpl();
		obj.add();
		obj.sub();
		add(1, 2, 3, 4);
		Inheritence I = new Inheritence();
		I.checkInheritence();
	}

	public static int add(int... value) {
		int sum = 0;
		for (int element : value) {
			sum = sum + element;
		}
		System.out.println(sum);
		return 0;
	}

}
