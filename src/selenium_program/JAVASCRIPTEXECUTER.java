package selenium_program;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;

public class JAVASCRIPTEXECUTER
{

	public static void main(String[] args) throws Exception
	{
		// java script execution
		System.setProperty("webdriver.chrome.driver","C:\\Jarfiles\\chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
//TEST CASES STEPS
		driver.manage().window().maximize();
		driver.get("http://183.82.103.245/nareshit/login.php");
		System.out.println(driver.getTitle());
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		Thread.sleep(3000);
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		// //using javascriptExecuter to click on login button
		WebElement loginbtn=driver.findElement(By.xpath("//input[@value='Login'][@class='button']"));
		JavascriptExecutor executor=(JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()",loginbtn);
		Thread.sleep(3000);
		System.out.println("login completed");
		  // using javascriptExecuter to click on logout button
		WebElement logoutbtn=driver.findElement(By.linkText("Logout"));
		JavascriptExecutor executor1=(JavascriptExecutor)driver;
		executor1.executeScript("arguments[0].click()",logoutbtn);
		System.out.println("logout completed");
		driver.close();
		}

}
