package pomscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pomconcept1 {
	@FindBy(id="email")
	private WebElement user;
	@FindBy(id="pass")
	private WebElement pawd;
	@FindBy(xpath="//button[.='Log in']")
	private WebElement button;
	public pomconcept1(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void username(String un)
	{
		user.sendKeys(un);
	}
	public void password(String pd)
	{
		pawd.sendKeys(pd);
	}
	public void log()
	{
		button.click();
	}

}
