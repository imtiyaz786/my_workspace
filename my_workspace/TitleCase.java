package my_workspace;

public class TitleCase {
	
	public static void main(String[] args) {
		String s=      "hello hi good noon hope we got thread safety";
		System.out.println(convertToTitleCase(s));
	}
	
	public static String convertToTitleCase(String s) {
		String str[] = s.split(" ");
		StringBuilder w = new StringBuilder();
		for (int i = 0; i < str.length; i++) {
			w.append(str[i].substring(0,str[i].length()-1)).append(Character.toUpperCase(str[i].charAt(str[i].length()-1))).append(" ");
		}
		return w.toString().trim();
		
	}
}