import java.util.HashMap;
import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> nations = new HashMap<String, Integer>();
		
		while(true) {
			System.out.print("Country name, Population >> ");
			
			String nation = sc.next();
			if(nation.equals("Stop")) break;
			int Population = sc.nextInt();
			nations.put(nation, Population);
		}
		
		while(true) {
			System.out.print("Search >> ");
			String nation = sc.next();
			if(nation.equals("Stop")) {
				System.out.println("Program end");
				break;
			}
			else if(nations.get(nation) != null)
				System.out.println("Population of " + nation + " is " + nations.get(nation));
			else
				System.out.println("No information");
		}

		sc.close();
	}
}