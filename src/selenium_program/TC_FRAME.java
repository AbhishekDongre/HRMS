package selenium_program;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class TC_FRAME {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Jarfiles\\chromedriver_win32//chromedriver.exe");
WebDriver driver =new ChromeDriver();
driver.navigate().to("http://183.82.103.245/nareshit/login.php");
System.out.println(driver.getTitle());
driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
driver.findElement(By.name("Submit")).click();
{
	System.out.println("login completed");
	}
//test steps of Frame
driver.switchTo().frame("rightMenu");
driver.findElement(By.xpath("//input[@value='Add']")).click();
driver.findElement(By.name("txtEmpFirstName")).sendKeys("abhishek");
driver.findElement(By.name("txtEmpLastName")).sendKeys("dongre");
driver.findElement(By.id("btnEdit")).click();
Thread.sleep(3000);
System.out.println("add new empoyee ");
driver.switchTo().defaultContent();
driver.findElement(By.linkText("Logout")).click();
Thread.sleep(3000);
driver.close();

	}

}
