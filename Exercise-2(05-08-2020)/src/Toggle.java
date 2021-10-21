import java.util.Scanner;

public class Toggle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your string to toggle");
		String s = sc.nextLine();
		String toggledString = "";
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if( (int) c >=97 && (int) c<=122 )
				toggledString += Character.toUpperCase(c);
			else
				toggledString += Character.toLowerCase(c);				
		}
		
		System.out.println("Your toggled String is: " + toggledString );
	}

}
