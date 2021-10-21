import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your string");
		String s = sc.nextLine();
		StringBuilder sb= new StringBuilder(s);
		StringBuilder revSb = sb.reverse();
		
		if(s.equals(revSb.toString()))
			System.out.println("String is Palindrome");
		else
			System.out.println("String is Not Palindrome");
				
	}

}
