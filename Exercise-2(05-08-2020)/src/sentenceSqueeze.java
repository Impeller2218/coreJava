import java.util.Scanner;

public class sentenceSqueeze {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sentance = sc.nextLine();
		sentance.trim();
		String answer="";
		for(int i=0;i<sentance.length();i++) {
				char c = sentance.charAt(i);
			if(c==' ' && sentance.charAt(i-1)!=' ')
				answer += " ";
			else if(c==' ' ) {
				continue;
			}
			else {
				answer += c;
			}
		}
		
		System.out.println(answer);
	}

}
