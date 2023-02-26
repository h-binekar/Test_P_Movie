import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Base.Test_base;



public class E2ETest {
	
@Test()
public void E2ETest() throws Exception {

	//Read prop file and get browser and url
	String browser = Test_base.readPropertiesFile("browser");
	String url = Test_base.readPropertiesFile("url");
	
	
	//Comparing data from Wiki and Imdb
	SoftAssert SA = new SoftAssert();
	SA.assertEquals("country_Imdb.getText();","country_wiki.getText();");
	SA.assertEquals("Release_date_Imdb.getText();", "Release_date_Wiki.getText();");
	SA.assertAll();
	   
}
}
