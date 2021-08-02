package my_workspace;


public class DigitManipulation {
	public static void main(String[] args) {
		
		String str[] = {"111", "203", "404", "514", "747"};
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length; i++) {
			if(str[i].charAt(0)==str[i].charAt(str[i].length()-1)) {
				
			}
			else {
				sb.append(str[i]).append(" ");
			}
		}
		System.out.print(sb.toString().trim());
		
	}


}
