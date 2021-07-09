public class SumOddInteger {

	public static void main(String[] args) {
		//Scanner inputObj = new Scanner(System.in);
		int  sum=0;
		for(int i=1;i<100;i++) {
			if(i/2!=0) {
				sum = sum+i;
			}
		}
		System.out.println(sum);

	}

}
