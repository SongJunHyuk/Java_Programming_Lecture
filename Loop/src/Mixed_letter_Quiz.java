import java.util.*;
public class Mixed_letter_Quiz {
	public static void main(String[] args) {
		String [] words = {"television", "computer", "mouse", "phone"};
		Scanner scanner = new Scanner(System.in);
		char tmp;
		for(int i = 0 ; i <words.length; i++) {
			char[] question = words[i].toCharArray();
		
			for( int j = 0 ; j < 10 ; j++) {
				int a = (int) (Math.random()*question.length);
				int b = (int) (Math.random()*question.length);
				tmp = question[b];
				question[b] = question[a];
				question[a] = tmp;
			}
			
			System.out.printf("Q%d. %s의 정답은?> ", i+1, new String(question));
			String answer = scanner.nextLine();
			if (words[i].equals(answer.trim())) System.out.println("맞았습니다");
			else System.out.println("틀렸습니다");
		}
	}
}