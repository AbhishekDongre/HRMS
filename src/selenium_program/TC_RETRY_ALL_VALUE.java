package selenium_program;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
public class TC_RETRY_ALL_VALUE {

	public static void main(String[] args)throws Exception {
		// test cases for retry all the value from search by dropdown
System.setProperty("webdriver.chrome.driver","C:\\Jarfiles\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://183.82.103.245/nareshit/login.php");
driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
Thread.sleep(3000);
driver.findElement(By.name("Submit")).click();
System.out.println("login completed");
//Verify Get Title
System.out.println(driver.getTitle());
Thread.sleep(3000);
//Enter into frame
driver.switchTo().frame("rightMenu");
//by using predefine class
Select st=new Select(driver.findElement(By.name("loc_code")));
//by using method
List<WebElement>drpval=st.getOptions();
for (WebElement val:drpval){
	System.out.println(val.getText());
}
driver.switchTo().defaultContent();
Thread.sleep(3000);
driver.findElement(By.linkText("Logout")).click();
System.out.println("login completed");
driver.close();

//Exit from frame
	}

}
