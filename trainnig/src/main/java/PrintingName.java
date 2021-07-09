public class PrintingName {

	public static void main(String[] args) {
		String name = new String("Dheeraj");
		int i = 0, j = 0;
		while (i < 10) {
			while (j < 10) {
				System.out.print(name + " ");
				j++;
			}
			System.out.println();
			i++;

		}
	}

}
