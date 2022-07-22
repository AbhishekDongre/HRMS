package selenium_program;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import java.util.List;
import org.openqa.selenium.WebElement;

public class TC_RETRY_ALL_LINKS_FROM_GOOGLE {

	public static void main(String[] args) throws Exception{
		// Test steps for verify all links in google
System.setProperty("webdriver.chrome.driver", "C:\\Jarfiles\\chromedriver_win32\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.google.com/");
Thread.sleep(3000);
List<WebElement>links=driver.findElements(By.tagName("a"));
for (WebElement lnk:links) {
	System.out.println(lnk.getText());
	Thread.sleep(3000);
	
}
driver.close();
}
}
