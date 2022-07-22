package selenium_program;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class FILEUPLOAD {

	public static void main(String[] args)throws Exception{
		
System.setProperty("webdriver.chrome.driver","C:\\Jarfiles\\chromedriver_win32//chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.navigate().to("http://183.82.103.245/nareshit/login.php");
driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
driver.findElement(By.name("Submit")).click();
Thread.sleep(3000);
//enter into frame
driver.switchTo().frame("rightMenu");
driver.findElement(By.xpath("//input[@type='button'][@value='Add']")).click();
driver.findElement(By.name("txtEmpFirstName")).sendKeys("Abhishek");
driver.findElement(By.name("txtEmpLastName")).sendKeys("Dongre");
Thread.sleep(3000);
//to upload files
WebElement fileInput=driver.findElement(By.xpath("//input[@name='photofile'][@id='photofile']"));
fileInput.sendKeys("D:\\MY DOCUMENTS\\MY PIC.JPEG");
driver.findElement(By.xpath("//input[@value='Save']")).click();
Thread.sleep(3000);
System.out.println("new empoyee added");
//exit from frame
driver.switchTo().defaultContent();
Thread.sleep(3000);
driver.findElement(By.linkText("Logout"));



	}

}
