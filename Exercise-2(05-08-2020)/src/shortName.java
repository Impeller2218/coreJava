import java.util.Scanner;

public class shortName {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
				String [] arr= name.split(" ");
				String sh = ""; 
				for(int i=0;i<=arr.length-2;i++){
				  sh=sh+arr[i].substring(0,1)+ ".";
				}
				sh=sh+(arr[arr.length-1]);
				System.out.println(sh);
				
	}

}
