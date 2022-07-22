package selenium_program;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import java.awt.Robot;
import java.awt.event.KeyEvent;


public class TC_KEYBOARD_ACTIONS {

	public static void main(String[] args)throws Exception{
	System.setProperty("webdriver.chrome.driver","C:\\Jarfiles\\chromedriver_win32//chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.navigate().to("http://183.82.103.245/nareshit/login.php");
Thread.sleep(3000);
driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
Thread.sleep(3000);
driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
Thread.sleep(3000);
//keyboard Actions
Robot r = new Robot();
r.keyPress(KeyEvent.VK_TAB);
r.keyRelease(KeyEvent.VK_TAB);
System.out.println("perform Tab Action");
r.keyPress(KeyEvent.VK_ENTER);
r.keyPress(KeyEvent.VK_ENTER);
System.out.println("perform Enter Action");
Thread.sleep(4000);
driver.findElement(By.linkText("Logout")).click();
System.out.println("logout completed");
Thread.sleep(3000);
driver.close();



	}

}
