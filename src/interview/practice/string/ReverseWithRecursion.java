package interview.practice.string;

public class ReverseWithRecursion {

	public static void main(String[] args) {

		ReverseWithRecursion input= new ReverseWithRecursion();
		System.out.println(input.reverseString("Rashmi"));
	}

	private String reverseString(String str) {
		if((str==null)|| (str.length()<=1 )){
			return str;
		}
		return reverseString(str.substring(1)) + str.charAt(0);
	}

}
