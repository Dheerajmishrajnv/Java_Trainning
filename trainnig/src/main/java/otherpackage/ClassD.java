package otherpackage;
import initialpackage.ClassA;
public class ClassD {

	public static void main(String[] args) {
		ClassA obj = new ClassA();
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
		System.out.println(obj.d);

		obj.add();
		obj.sub();
		obj.mult();
		obj.div();
	}

}
