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
			System.out.print("1�� 100 ������ ���� �Է��ϼ��� :");
			input = sc.nextInt();
			if(answer > input) System.out.println("�� ū�� �Դϴ�");
			else if(answer < input) System.out.println("�� ���� �� �Դϴ�.");
			else {
				System.out.println("�����Դϴ�.");
				System.out.println("�õ� Ƚ���� = " + count);
				break;
			}
		}while(true);
	}
}