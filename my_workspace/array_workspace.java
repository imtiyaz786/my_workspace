package my_workspace;

import java.util.Arrays;
import java.util.Scanner;

public class array_workspace {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		int arr[] = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println(nthMax(arr, n));
		
		
		
		
	}

	public static int nthMax(int[] arr, int n) {
		Arrays.sort(arr);
		return arr[n -1];
		
	}
	
}
