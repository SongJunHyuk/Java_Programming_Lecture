public class Distance {

	static double getDistance(int x1, int x2, int y1, int y2) // mathŬ������ ��� object���� static���� �Ǿ��ִ�.
	{
		return Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
	}
	
	public static void main(String[] args) {
		System.out.println(getDistance(1, 1, 2, 2));
	}
}