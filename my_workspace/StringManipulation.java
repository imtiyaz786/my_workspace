package my_workspace;

public class StringManipulation {
	
	public static void main(String[] args) {
		
		String s= "hello hi good noon hope we got thread safety";

		System.out.println(printReverse(s));

		
	}
	
	public static String printReverse(String s) {
	String str2[] = s.split("");
	StringBuilder sb = new StringBuilder();
	StringBuilder sb2 = new StringBuilder();
	for (int i = 0; i < str2.length; i++) {
		sb2.append(sb.append(str2[i]).reverse());
		
		
	}
	return sb.toString().trim();
	
} 

}
