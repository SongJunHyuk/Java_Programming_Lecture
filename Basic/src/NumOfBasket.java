
public class NumOfBasket {
	public static void main(String[] args) {
		int numOfApples = 52;
		int sizeOfBasket = 10;
		int numOfBasket = numOfApples / sizeOfBasket + (numOfApples%sizeOfBasket > 0 ? 1 : 0);
		System.out.println("The number of Basket is " + numOfBasket);
	}
}
