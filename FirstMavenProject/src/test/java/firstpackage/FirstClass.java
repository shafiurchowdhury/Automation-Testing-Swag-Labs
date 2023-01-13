package firstpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstClass {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriverManager.firefoxdriver().setup();
		WebDriverManager.edgedriver().setup();
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		String b=driver.getCurrentUrl();
		System.out.print(b);
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).sendKeys("select cart");
		driver.findElement(By.className("shopping_cart_badge")).click();
		driver.findElement(By.id("checkout")).sendKeys("Check all");
		driver.findElement(By.id("first-name")).sendKeys("Rahim");
		driver.findElement(By.id("last-name")).sendKeys("ali");
		driver.findElement(By.id("postal-code")).sendKeys("222");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("finish")).click();
		driver.findElement(By.id("back-to-products")).click();
		
		
		
	}

}
