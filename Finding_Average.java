import java. util.Scanner;

public class Finding_Average {

	public static void main(String[] args) {
		int intArray[] = new int[5];
		int sum = 0;
		
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < intArray.length; i++)
			intArray[i] = scanner.nextInt();
		
		for(int i=0; i < intArray.length; i++)
			sum += intArray[i];
		
		System.out.println("avaerage is " + (double)(sum/intArray.length));
		scanner.close();
	}
}
