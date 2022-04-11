import java.util.*;

public class Up_and_Down_Game {
	public static void main(String[] args) {
		int input = 0;
		int count = 0;
		Random random = new Random();
		int answer = (random.nextInt(100) + 1);
		Scanner sc = new Scanner(System.in);
		
		do {
			count++;
			System.out.print("1과 100 사이의 값을 입력하세요 :");
			input = sc.nextInt();
			if(answer > input) System.out.println("더 큰수 입니다");
			else if(answer < input) System.out.println("더 작은 수 입니다.");
			else {
				System.out.println("정답입니다.");
				System.out.println("시도 횟수는 = " + count);
				break;
			}
		}while(true);
	}
}