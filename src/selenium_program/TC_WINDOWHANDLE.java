package selenium_program;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

import org.openqa.selenium.By;
public class TC_WINDOWHANDLE {

	public static void main(String[] args)throws Exception {
		//Test steps for WINDOW HANDLE
		System.setProperty("webdriver.chrome.driver","C:\\Jarfiles\\chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//ENTER INTO 1ST WINDOW
		driver.get("file:///C:/Users/Abhishek%20Dongre/Downloads/multiplewindows.html");
		System.out.println("enter into first window");
		Thread.sleep(3000);
		//ENTER INTO 2ND WINDOW
		driver.findElement(By.id("btn2")).click();
		System.out.println("enter into 2nd window");
		Thread.sleep(3000);
		//ENTER INTO 2ND WINDOW
		driver.findElement(By.id("btn3")).click();
		Thread.sleep(3000);
		ArrayList<String>windwsinfo= new ArrayList<String>(driver.getWindowHandles());
		//EXIT TO WINDOWS
		driver.switchTo().window(windwsinfo.get(0));
		Thread.sleep(3000);
		driver.close();//to close the window
		//driver.quit();
		
		
		
	}

}
