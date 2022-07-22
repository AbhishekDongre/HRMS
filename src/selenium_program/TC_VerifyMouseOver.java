package selenium_program;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class TC_VerifyMouseOver {
static String username="nareshit";
static String password="nareshit";
static String title1="OrangeHRM-New Level of HR Management";
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
//test case steps
		System.setProperty("webdriver.chrome.driver", "C:\\Jarfiles\\chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		Thread.sleep(10000);
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		Thread.sleep(3000);
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		Thread.sleep(3000);
		driver.findElement(By.name("Submit")).click();
		if(driver.getTitle().equals("OrangeHRM")) {
			System.out.println("Title matched");
		}
		else{
			System.out.println("Title not matched");
			System.out.println(driver.getTitle());
		}
	//mouse over 
		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(By.linkText("PIM"))).perform();
		{
			System.out.println("mouse over completed");
		}
		//click on submit
		Thread.sleep(3000);
		driver.findElement(By.linkText("Add Employee")).click();
		Thread.sleep(4000);
		driver.close();
		Thread.sleep(10000);
		{
			System.out.println("Logout complted");
		}
	}

}