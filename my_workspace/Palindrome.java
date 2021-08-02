package my_workspace;
import java.util.Scanner;

public class Palindrome {
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		int arr[] = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		
		
		isPalindrome(arr, n);
	}
		
	public static void isPalindrome(int arr[], int n) {
		for (int i = 0; i < n; i++) {
			if (arr[i] == reverse(arr[i]))
				System.out.println(arr[i]);
		}
	}
		public static int reverse(int x) {
			int r = 0;
			while (x != 0) {
			int d = x % 10;
			r *= 10 + d;
			x /= 10;
			}
		return r;
		}
	}
	