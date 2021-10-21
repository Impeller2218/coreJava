import java.util.Scanner;

public class reverseWord {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	String str = sc.nextLine();
	String words[] = str.split(" ");
	String reverseWord="";  
	for(String w:words){  
		StringBuilder sb=new StringBuilder(w);  
		sb.reverse();  
		reverseWord+=sb.toString()+" ";  
	}
	
		System.out.println(reverseWord);
}
}
 