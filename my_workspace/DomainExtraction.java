package my_workspace;

public class DomainExtraction {

	public static void main(String[] args) {
		String 	str = "https://app.revature.com";
		System.out.println(str.replaceAll("[// / :]", "").replace("https", "app.revature.com"));
		
	}

}
