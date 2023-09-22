package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class AppTest{
	public static void main(String[] args) {
		System.out.println("Hello");
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");

		}
}