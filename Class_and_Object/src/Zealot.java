
public class Zealot {
	int x= 0, y = 0;
	int hp = 100;
	static int weapon = 16;
	static int armor = 1;
	
	static void weaponUp() {
		this.weapon += 2;
	}
	
	static void armorUp() {
		this.armor += 1;
	}
	
	void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
