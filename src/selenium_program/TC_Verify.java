package selenium_program;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class TC_Verify {

	public static void main(String[] args)throws Exception {
	System.setProperty("webdriver.chrome.driver","C:\\Jarfiles\\chromedriver_win32\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
//verify titles
if (driver.getTitle().equals("orangeHRM")){
	System.out.println("Title matched");
}
else {
	System.out.println("Title not Matched");
	System.out.println(driver.getTitle());
}
driver.findElement(By.name("txtUsername")).sendKeys("Admin");
driver.findElement(By.name("txtPassword")).sendKeys("admin123");
driver.findElement(By.name("Submit")).click();
driver.close();
Thread.sleep(30000);
if (driver.getTitle().equals("OrangeHRM")) {
	System.out.println("Title matched");
}
else {
	
	System.out.println(driver.getTitle());
	System.out.println("Title not matched");
	Thread.sleep(3000);
}
	}

}
