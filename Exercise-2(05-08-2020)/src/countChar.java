import java.util.Scanner;

public class countChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		System.out.println("Enter your word");
		String str = word.toLowerCase();
		char stringArr[] = str.toCharArray();
		int[] frequency = new int[str.length()];
		for(int i=0;i<stringArr.length;i++) {
			frequency[i] = 1;
			for(int j=i+1;j<str.length();j++) {
				if(stringArr[i]==stringArr[j]) {
					frequency[i]++;
				stringArr[j]=' ';
				}
			}
		}
			
		for(int i=0;i<stringArr.length;i++) {
			if(stringArr[i]==' ')
				continue;
			System.out.println(stringArr[i] + " -> " + frequency[i]);
		}
	}
}