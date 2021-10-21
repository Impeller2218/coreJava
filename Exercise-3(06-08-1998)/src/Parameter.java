import java.util.Scanner;

public class Parameter {

	public static void getPerimeter(int arr[]) {
		
		for(int i=0;i<5;i++) {
			double perimeter = 2*3.14*arr[i];
			System.out.println("Perimeter of " + (i+1) + " circle is " + perimeter);
		}
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int[] radius = new int[5];
		System.out.println("Enter elements of the array");
		for(int i=0;i<5;i++) {
			radius[i]=sc.nextInt();
		}
		getPerimeter(radius);
	}

}
