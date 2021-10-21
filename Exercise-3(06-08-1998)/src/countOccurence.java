import java.util.Scanner;

public class countOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of the array");
		int n = sc.nextInt();
		int[] arr = new int[n];
		int[] arr1 = new int[n];
		System.out.println("Enter elements of the array");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			int count =1;
			for(int j=i+1;j<n;j++) {
				if(arr[i]==arr[j]) {
					count++;
					arr[j]=' ';
				}
			}
			arr1[i] = count;
		}
		System.out.println("occurence of each character");
		for(int i=0;i<n;i++) {
			if(arr[i]!=' ')
				System.out.println(arr[i] + " -> " +arr1[i]);
		}
	}

}
