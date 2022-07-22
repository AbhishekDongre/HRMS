package selenium_program;
import org.openqa.selenium.WebDriver;    //for webdriver
import org.openqa.selenium.chrome.ChromeDriver; //for chrome driver
import org.openqa.selenium.By;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Actions;
import static org.testng.Assert.assertEquals;
public class TC_DRAG_DROP {

	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver","C:\\Jarfiles\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(3000);
driver.get("https://jqueryui.com/droppable/");
//verify title __condition fail__stop__execution
assertEquals(driver.getTitle(),"Droppable | jQuery UI");//method
System.out.println("title matched");
//enter into frame
driver.switchTo().frame(0);//frame
Actions ac = new Actions(driver);
Thread.sleep(5000);
ac.dragAndDrop(driver.findElement(By.id("draggable")),driver.findElement(By.id("droppable"))).perform();
Thread.sleep(5000);
System.out.println("drag and drop activity complred");
//exit into frame
driver.switchTo().defaultContent();//frame exit
driver.close();



	}

}
