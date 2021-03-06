package Assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithChrome {

	ChromeDriver driver;
	
	public void invokeBrowser() {
		
	System.setProperty("webdriver.chrome.driver", "C:/Users/Akshay/eclipse-workspace/libs/chromedriver_03062020/chromedriver.exe");
	
	driver = new ChromeDriver();
	
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.get("https://www.edureka.co/");
	
} 
	public void searchEdureka(String userSearch) {
		
		WebElement search;
		
		search = driver.findElement(By.id("search-inp3"));
		
		search.sendKeys(userSearch);
		
		driver.navigate().back();
		
	}
	
	public void login() {
		
		driver.findElement(By.linkText("Log In")).click();
	
}

	public void studentLogin(String userId, String password) {
		
		driver.findElement(By.xpath("//input[@id=\"si_popup_email\"]")).sendKeys(userId);
		
		driver.findElement(By.xpath("//input[@id=\"si_popup_passwd\"]")).sendKeys(password);
		
		driver.findElement(By.cssSelector("button[class='clik_btn_log btn-block']")).click();
		
		
	}
	
	public void logOut() {
		
		driver.findElement(By.cssSelector("div.btn-group open")).click();
		
		
	
}}
