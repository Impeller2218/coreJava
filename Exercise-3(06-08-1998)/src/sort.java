import java.util.Arrays;
import java.util.Scanner;

public class sort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of the array");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter elements of the array");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		Arrays.sort(arr);
		System.out.println("Array in descending  order");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.println(arr[i]);
		}
	}

}
