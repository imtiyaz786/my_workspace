package my_workspace;

import java.util.Scanner;

public class Prime {
	

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		int arr[] = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		
		for (int i = 0; i < n; i++) {
			if (isPrime(arr[i]))
				System.out.println(arr[i]);
			
		}
	}
	public static boolean isPrime(int x) {
		if (x <= 1)
			return false;
		for (int i = 2; i <= x /2; i++) {
			if (x % 2 == 0)
				return false;
		}
		return true;
	}
}
