package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Wiki_Page {
	WebDriver driver;
	
	public Wiki_Page(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	//Object Repository
	
	@FindBy (xpath = "//td[text()='India']")
	WebElement country_wiki;
	
	@FindBy (xpath = "//span[@style='display:none']//parent::li")
	  WebElement Release_date_Wiki;
	
	
}
