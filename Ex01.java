import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print(">>");;
			String text = scanner.nextLine();
			if(text.equals("exit")) {
				break;
			}
		}
		System.out.println("Complete");
		
		scanner.close();
	}
}
