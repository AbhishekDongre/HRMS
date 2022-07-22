package selenium_program;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;
import java.io.File;
import org.apache.commons.io.FileUtils;

public class TC_SCREEN_SHOT {

	public static void main(String[] args) throws Exception {
		
		// System.setProperty("
		 System.setProperty("webdriver.chrome.driver","C:\\Jarfiles\\chromedriver_win32//chromedriver.exe");
		
		 WebDriver driver= new ChromeDriver();
		 try {
		 driver.get("http://183.82.103.245/nareshit/login.php");
		 driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	        driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	        driver.findElement(By.name("Submit")).click();
	          Thread.sleep(3000);
	        WebElement element = driver.findElement(By.linkText("PIM"));
	         Actions action = new Actions(driver);
	        action.moveToElement(element).perform();
	        Thread.sleep(3000L);
	    driver.findElement(By.linkText("Add Employee123")).click();
	        Thread.sleep(4000);
	        System.out.println("Clicked on submenu");        
	    driver.findElement(By.linkText("Logout")).click();
	    }
	    catch(Exception e){
	File f1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(f1, new File("C:\\Jarfiles\\Screen Shot\\Screen Shot.png"));
	      }
	    driver.close();
	   // System.out.println("Successfull");
	}
	}
		
		 
	


