import java.util.ArrayList;
import java.util.Scanner;
public class Exercise1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Character> grade = new ArrayList<Character>();
		
		System.out.print("6개의 학점 입력 >>");
		for(int i = 0 ; i < 6; i++)
		{
			char c = sc.next().charAt(0);
			grade.add(c);
		}
		int sum = 0;
		for(int i = 0 ; i < grade.size() ; i++) {
			char c = grade.get(i);
			switch(c) {
			case 'A' :
				sum+=4;
			break;
			
			case 'B' :
				sum+=3;
				break;
				
			case 'C' :
				sum+=2;
				break;
				
			case 'D' :
				sum+=1;
				break;
				
			case 'F' :
				sum+=0;
				break;
			}
			
		}
		double avg = (double)sum / grade.size();
		System.out.println(avg);
		sc.close();
	}
}