package selenium_program;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;


public class WEB_TABLE {

	public static void main(String[] args)throws Exception {
		//Test Steps
		System.setProperty("webdriver.chrome.driver","C:\\Jarfiles\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
driver.get("file:///C:/Users/Abhishek%20Dongre/Downloads/WebTable.html");
//count
int row =driver.findElements(By.xpath("//*[@id=\"idCourse\"]/tbody/tr")).size();
Thread.sleep(3000);
int col =driver.findElements(By.xpath("//*[@id=\"idCourse\"]/tbody/tr[1]/td")).size();
Thread.sleep(3000);
int row_col =driver.findElements(By.xpath("//*[@id=\"idCourse\"]/tbody/tr/td")).size();
System.out.println("all rows");
System.out.println("all column");
System.out.println("all rows & column");

//Table_cell
String celldata=driver.findElement(By.xpath("//*[@id=\"idCourse\"]/tbody/tr[2]/td[2]")).getText();
System.out.println("cell data");
 //Table all Data
 //by using Loop concept

 for(int i=1;i<=row;i++) {String data =driver.findElement(By.xpath("//*[@id='idCourse']/tbody/tr["+i+"]")).getText();
 Thread.sleep(3000);
	 driver.close();
	 
 }
 }
}
    


