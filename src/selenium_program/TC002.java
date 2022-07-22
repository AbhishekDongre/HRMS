package selenium_program;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
public class TC002 {
public static void main(String args[])throws Exception {
	//test cases steps
	System.setProperty("webdriver.chrome.driver","C:\\Jarfiles\\chromedriver_win32\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.navigate().to("http://183.82.103.245/nareshit/login.php");
Thread.sleep(3000);
System.out.println("opem aaplication");
driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
driver.findElement(By.name("Submit")).click();
Thread.sleep(3000);
driver.findElement(By.linkText("Logout")).click();
driver.close();
}
}