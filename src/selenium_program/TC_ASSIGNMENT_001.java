package selenium_program;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
public class TC_ASSIGNMENT_001 {

	public static void main(String[] args)throws Exception {
		// test steps
		System.setProperty("webdriver.chrome.driver", "C:\\Jarfiles\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://183.82.103.245/nareshit/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		Thread.sleep(3000);
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		Thread.sleep(3000);
		driver.findElement(By.name("Submit")).click();
		System.out.println("login complred");
		Thread.sleep(4000);
		//enter into the frame
		driver.switchTo().frame("rightMenu");
		   // DT VAR VV    
		for(int i=1;i<=60;i=i+2) {
			driver.findElement(By.
					xpath("//*[@id='standardView']/table/tbody/tr["+i+"]/td[1]/input")).click();
			//driver.findElement(By.xpath("//*[@id=\"standardVi")).click();
			System.out.println("clicked on checkbox of"+i);
			Thread.sleep(1000);
		}
		driver.switchTo().defaultContent();
	
		driver.findElement(By.linkText("Logout")).click();
		//Thread.sleep(30000);
		//driver.close();
	}

}
