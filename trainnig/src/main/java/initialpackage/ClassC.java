package initialpackage;

public class ClassC extends ClassA {
	public void check() {
		super.add();
	}
	public static void main(String[] args) {
		ClassA A = new ClassA();
		System.out.println(A.a);
		System.out.println(A.b);
		System.out.println(A.c);
		System.out.println(A.d);

		A.add();
		A.sub();
		A.mult();
		A.div();
		
	}
}
