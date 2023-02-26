package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IMDB_Page {
	WebDriver driver;
	public IMDB_Page(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy (xpath = "//a[text()='India']")
	WebElement country_Imdb;
	
	
	@FindBy (xpath = "//a[text()='December 17, 2021 (United States)']")
	WebElement Release_date_Imdb;
	
	
	
}
