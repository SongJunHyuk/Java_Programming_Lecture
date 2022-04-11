
public class Is_Char_or_Int {

	public static void main(String[] args) {
		char ch = 'a';
		Boolean b = ('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z') || ('0' <= ch && ch <= '9');
		System.out.println(b);
	}
}