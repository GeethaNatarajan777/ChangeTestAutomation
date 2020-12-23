package ObjectPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GooglePageObjects extends BaseClass {
	
	@FindBy(xpath = "//a[contains(@href,'mail')][@class='gb_g']")
	private WebElement gmaillink;
	
	public WebElement Getgmaillink () {
		return gmaillink;
	}
	
	public void clickgmail() {
		gmaillink.click();
	}

}
