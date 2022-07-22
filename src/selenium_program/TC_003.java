package selenium_program;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class TC_003 {

	public static void main(String[] args) throws Exception{
	System.setProperty("webdriver.chrome.driver","C:\\Jarfiles\\chromedriver_win32//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("http://183.82.103.245/nareshit/index.php");
	driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	driver.findElement(By.name("Submit")).click();
driver.switchTo().frame("rightMenu");
driver.findElement(By.name("txtEmpFirstName")).sendKeys("Abhishe");
driver.findElement(By.name("txtEmpLastName")).sendKeys("Dongre");
//test cases for file uploads
WebElement fileInput=driver.findElement(By.xpath("//input[@value=file][@name=photofile]"));
fileInput.sendKeys("Downloads");
Thread.sleep(3000);
System.out.println("fileupload is sussesfully");
driver.findElement(By.id("btnEdit")).click();
Thread.sleep(3000);
System.out.println("add empoyee details susessfully");
driver.switchTo().defaultContent();

	}
	

}
 