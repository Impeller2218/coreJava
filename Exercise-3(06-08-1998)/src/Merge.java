import java.util.Scanner;

public class Merge {
	
	public static int[] mergedTwoArray(int arr1[],int arr2[],int n1,int n2) {
		
		int mergedArray[] = new int[n1+n2];
		int i;
		for( i=0;i<n1;i++) {
			mergedArray[i]=arr1[i];
		}
		
		for(int j=0;j<n2;j++){
		    mergedArray[i]=arr2[j];
		    i++;
		}
		
		
		return mergedArray;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of the first array");
		int n1 = sc.nextInt();
		System.out.println("Enter Size of the Second array");
		int n2 = sc.nextInt();
		int[] arr1 = new int[n1];
		int[] arr2 = new int[n2];
		System.out.println("Enter elements of the first array");
		for(int i=0;i<n1;i++) {
			arr1[i]=sc.nextInt();
		}
		System.out.println("Enter elements of the second array");
		for(int i=0;i<n2;i++) {
			arr2[i]=sc.nextInt();
		}
		Merge m =new Merge();
		
	     int arr[]=mergedTwoArray(arr1, arr2,n1,n2); 
	     for(int i=0;i<arr.length;i++){
	    	 System.out.println("Elements of the merged array is:");
	         System.out.println(arr[i]);
	     }
	}

}