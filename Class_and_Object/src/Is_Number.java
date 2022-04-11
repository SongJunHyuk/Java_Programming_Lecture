
public class Is_Number {

	public static boolean isNumber(String str) {
		if(str.equals(null) || str.equals(""))
		for ( int i = 0 ; i < str.length ; i++)
			if(ch < '0' || ch > '9')
	}
	
	public static void main(String[] args) {
		String str = "123";
		System.out.println(str + "은 숫자입니까? " + isNumber(str));
		str = "1234t";
		System.out.println(str + "은 숫자입니까? " + isNumber(str));
	}

}
