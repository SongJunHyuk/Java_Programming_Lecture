import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Vector;

public class CapitalGame {
	private Scanner sc = new Scanner(System.in);
	private Vector<Nation> store = new Vector<Nation>();

	public CapitalGame() {
		store.add(new Nation("�߽���", "�߽��ڽ�Ƽ"));
		store.add(new Nation("������", "������"));
		store.add(new Nation("������", "�ĸ�"));
		store.add(new Nation("����", "����"));
		store.add(new Nation("�׸���", "���׳�"));
		store.add(new Nation("����", "������"));
		store.add(new Nation("�Ϻ�", "����"));
		store.add(new Nation("�߱�", "����¡"));
		store.add(new Nation("���þ�", "��ũ��"));
	}
	
	private boolean contains(String country)
	{
		for(int i = 0 ; i < store.size(); i++) {
			if(store.get(i).getCountry().equals(country))
				return true;
		}
		return false;
	}
	public void input()
	{
		int n = store.size();
		System.out.println(n + " nations and capitals were saved");
		while(true) {
			System.out.println("Input nation and capital>> ");
			String country = sc.next();

			if (country.equals("Stop")) {
				break;
			}
			
			String capital = sc.next();
			if(contains(country))
			{
				System.out.println(country + " is already saved");
				continue;
			}
			store.add(new Nation(country, capital));
		}
		
	}
	
	public void quiz()
	{
		while(true) {
			int index = (int)(Math.random()*store.size());
			Nation nation = store.get(index);
			String q = nation.getCountry();
			String a = nation.getCapital();
			System.out.println(q + "\'s capital?");
			
			String capitalFromUser = sc.next();
			if(capitalFromUser.equals("Stop"))
			{
				break;
			}
			
			if(capitalFromUser.equals(a))
				System.out.println("Correct");
			else
				System.out.println("Incorrect");
		}
	}
	
	public void gameEnd() {
		System.out.println("Game End");
		this.sc.close();
	}
	
	public void run() {
		System.out.println("** Game start **");
		while (true) {
			System.out.print(" Input:1, Quiz:2, Exit:3 >> ");
			int menu = sc.nextInt();
			switch (menu) {
			case 1:
				input();
				break;
			case 2:
				quiz();
				break;
			case 3:
				gameEnd();
				return;
			default:
				System.out.println("wrong input");
			}
		}
	}
	public static void main(String args[]) {
		CapitalGame cg = new CapitalGame();
		cg.run();
	}
}