package my_workspace;


public class SecurityValidation {

	public static void main(String[] args) {
		System.out.print(isSecured("https://en.wikipedia.org/wiki/Main_Page"));
		
		
		

	}
	public static String isSecured(String url) {
		if(url.startsWith("https"))
			return "secured";
		else 
			return "not secured";
		
	}

}
