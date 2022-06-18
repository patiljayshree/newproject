package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	@FindBy(id="txtUsername")
	private WebElement Usrenametext;

	@FindBy(xpath="//input[@id='txtPassword']")
	private WebElement passwrdText;
	
	@FindBy(css="input#btnLogin")
	private WebElement loginbutton;
	
	public Loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public boolean isbuttonPresent()
	{
		boolean stateOfbutton=loginbutton.isDisplayed();
		return stateOfbutton;
	}
	public void login(String user,String pass)
	{
		Usrenametext.sendKeys(user);
		passwrdText.sendKeys(pass);
		loginbutton.click();
	}
   
}
