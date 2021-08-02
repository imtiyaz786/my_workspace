package my_workspace;

public class DomainExtraction {

	public static void main(String[] args) {
		String 	str = "https://en.wikipedia.org/wiki/Main_Page";
		String str1 = str.replaceAll("[// / :]", "").replace("httpsen.wikipedia.orgwikiMain_Page", "en.wikipedia.org");
		System.out.println(str1);
		
	}

}
