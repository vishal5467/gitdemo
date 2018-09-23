import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class selectwithsamelink {
	WebDriver driver;
	
  @Test
  public void f() {
  }
  @BeforeClass
  public void beforeClass() 
  {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\computer\\Desktop\\selenium_workspace\\Java_Training\\library\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get
		 
		 
		 
		 
  }

  @AfterClass
  public void afterClass() {
  }

}
