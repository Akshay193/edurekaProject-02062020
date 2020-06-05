package Assignment1;

public class DemoWorkingWithChrome {

	public static void main(String[] args) {
		
		WorkingWithChrome wc = new WorkingWithChrome();
		
		wc.invokeBrowser();
		
		//wc.searchEdureka("Search for a Course");
		
		wc.login();
		
		wc.studentLogin("akshay1193s@gmail.com", "akki9307322469");
		
		wc.logOut();

	}

}
