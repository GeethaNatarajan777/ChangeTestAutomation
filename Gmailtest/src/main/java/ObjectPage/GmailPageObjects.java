package ObjectPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GmailPageObjects extends GooglePageObjects {

	@FindBy(xpath= "//input[@id='identifierId']")
	private WebElement emailid;
	
	@FindBy(xpath= "//span[@class='RveJvd snByac']")
	private WebElement clicknext;
	
	@FindBy (xpath= "//input[@name='password']")
	private WebElement password;
	
	@FindBy (xpath= "//*[@id=\"passwordNext\"]/span/span")
	private WebElement passwordNext;
	
	@FindBy (xpath= "//*[@id=\":le\"]/div/div")
	private WebElement compose;
	

public WebElement getemailid() {
	return emailid;
}

public void getclicknext() {
	clicknext.click();
}

public WebElement getpassword() {
	return password;
}

public void getpasswordNext() {
	 passwordNext.click();
}

public WebElement getcompose() {
	return compose;
}

}