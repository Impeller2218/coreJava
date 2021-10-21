import java.util.Scanner;

public class titleCase {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			String name = sc.nextLine();
			String [] arr= name.split(" ");
			String sh = ""; 
			for(int i=0;i<=arr.length-1;i++){
			  String word= arr[i];
			  sh=sh+arr[i].substring(0,1).toUpperCase()+word.substring(1)+" ";
			 
			}
	    	System.out.println(sh);
			
		}
	}
