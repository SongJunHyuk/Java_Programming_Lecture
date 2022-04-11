
public class Loop_Until_Hundred {

	public static void main(String[] args) {
		int num = 0;
		int sum = 0;
		int s = 1;
		for ( int i = 1; sum < 100; i++, s=-s) {
			num = s * i;
			sum += num;
		}
		System.out.println("num = " + num);
	}

}
