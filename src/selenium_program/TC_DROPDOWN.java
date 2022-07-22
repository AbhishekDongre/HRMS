package selenium_program;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;


public class TC_DROPDOWN {

	public static void main(String[] args)throws Exception {
	//test cases for drop down
		System.setProperty("webdriver.chrome.driver","C:\\Jarfiles\\chromedriver_win32//ChromeDriver.exe");
WebDriver driver =new ChromeDriver();
driver.navigate().to("http://183.82.103.245/nareshit/login.php");
driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
Thread.sleep(3000);
driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
driver.findElement(By.name("Submit")).click();
Thread.sleep(3000);
System.out.println("login complted");
//enter into frame.
driver.switchTo().frame("rightMenu");
Select st=new Select(driver.findElement(By.name("loc_code")));
st.selectByValue("2");
Thread.sleep(3000);
driver.findElement(By.name("loc_name")).sendKeys("Dongre");
Thread.sleep(3000);
driver.findElement(By.xpath("//input[@value='Search']")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//input[@type='button'][@onclick='returnSearch();']")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//input[@value='Delete']")).click();
Thread.sleep(3000);
driver.switchTo().defaultContent();
driver.findElement(By.linkText("Logout")).click();
Thread.sleep(3000);
driver.close();
	}

}
