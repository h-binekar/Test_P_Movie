package Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;

public class Test_base {
	
	
	public static String readPropertiesFile(String key) throws Exception
	{
		
			// load data from properties file
			String projectpath = System.getProperty("user.dir");
			FileInputStream fis = new FileInputStream(projectpath+"/src/main/java/Config/config.properties");
			Properties prop = new Properties();
			prop.load(fis);
			
			
			//Read data
			ChromeDriver driver = new ChromeDriver();
			driver.get(prop.getProperty("url"));
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
			String value = prop.get(key).toString();

			//checking condition if browser is null it throws an exception
			if(value.isEmpty())
			{
				throw new Exception("value is not specified for key: "+key+" in properties file");
			}
			return value; 
			
			
	}
			
}



