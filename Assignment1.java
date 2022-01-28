import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver", ".\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://w2A.com/AutomationPractice");
        Thread.sleep(3000);
       //1. Check the first  Checkbox and verify if it is successfully checked and Uncheck it again to verify if it is successfully Unchecked
         driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
         Assert.assertTrue(driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).isSelected()); //Assertion for checked boxed
         driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
         Assert.assertFalse(driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).isSelected()); //Assertion for unchecked boxed
	
	//2. How to get the Count of number of check boxes present in the page 
        System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
	}

}
