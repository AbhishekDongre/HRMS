package selenium_program;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.By;
public class MY_TC_COUNT_CHECKBOXES {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Jarfiles\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://183.82.103.245/nareshit/index.php");
driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
driver.findElement(By.name("Submit")).click();
Thread.sleep(3000);
//enter into the frame
driver.switchTo().frame("rightMenu");
List<WebElement>checkboxSize=driver.findElements(By.xpath("//input[@type='checkbox'][@name='chkLocID[]']"));
//List<WebElement>checkboxSize=driver.findElements(By.xpath("//input[@type='checkbox'][@name='chkLocID[]']"));
System.out.println("The checkbox size::"+checkboxSize.size());
Thread.sleep(3000);
driver.close();
}
	}


