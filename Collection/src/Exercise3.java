import java.util.Scanner;
import java.util.Vector;
public class Exercise3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Vector<Integer> vc = new Vector<>();
		
		while(true)
		{
			System.out.print("Input precipitation (Exit on input 0) >> ");
			int num = sc.nextInt();
			if(num == 0)
				break;
			vc.add(num);
			int sum = 0;
			for(int i = 0 ; i < vc.size(); i++) {
				
				System.out.println(vc.get(i) + " ");
				sum += vc.get(i);
			}
			System.out.println("Average " + sum/vc.size());
		}
		sc.close();
	}
}
