
public class Linear_equation {
	public static void main(String[] args) {
		int x, y;
		for( x = 0 ; x <= 20 ; x++) {
			for(y = 0; y <= 20 ; y++) {
				if(((3 * x) + (6 * y)) == 15)
					System.out.println("x = " + x + ", y = " + y);
			}
		}
	}
}