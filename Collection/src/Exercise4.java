import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;
public class Exercise4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Double> manage = new HashMap<>();

		for(int i = 0 ; i < 5 ; i++) {
			System.out.print("name and grade >> "); 
			String text = sc.nextLine();
			StringTokenizer st = new StringTokenizer(text, " ");
			
			String name = st.nextToken().trim();
			double grade = Double.parseDouble(st.nextToken().trim());
			
			manage.put(name, grade);
		}

		System.out.print("Scholarship criteria >> ");
		double cutline = sc.nextDouble();
		
		Set<String> key = manage.keySet();
		Iterator<String> it = key.iterator();
		System.out.print("Scholarship students: ");
		
		while(it.hasNext() ) {
			String name = it.next();
			double grade = manage.get(name);
			if(grade >= cutline)
				System.out.print(name + " ");
		}
		
		sc.close();
	}

}
