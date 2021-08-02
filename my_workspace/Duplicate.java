package my_workspace;

import java.util.Arrays;
import java.util.Scanner;

public class Duplicate {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		int arr[] = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		
		removeDuplicate(arr, n);
		System.out.println(Arrays.toString(arr));
		
		
		
		
	}
	
	public static int removeDuplicate(int[] arr, int n) {
		if(n == 0 || n == 1)
			return n;
		int x = 0;
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] != arr[i+1])
				arr[x++] = arr[i];
		}
		arr[x++] = arr[n-1];
		return x;
	}
}
		
	