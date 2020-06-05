package Assignment1;

public class DemoWorkingWithFirefox {

	public static void main(String[] args) {
		
		WorkingWithFirefox we = new WorkingWithFirefox();
		
		we.invokeBrowser();
		
		//wc.searchEdureka("Search for a Course");
		
		we.login();
		
		we.studentLogin("akshay1193s@gmail.com", "akki9307322469");
		
		we.logOut();

	}

}
