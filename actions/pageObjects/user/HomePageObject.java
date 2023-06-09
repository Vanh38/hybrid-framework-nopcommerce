package pageObjects.user;

import org.openqa.selenium.WebDriver;
import commons.BasePage;
import commons.PageGeneratorManager;
import pageUIs.user.HomePageUI;

public class HomePageObject extends BasePage {
private WebDriver driver;

     public HomePageObject(WebDriver driver) {
	this.driver = driver;
}
	
   
	public RegisterPageObject clickToRegisterLink() {
		waitForElementClickable(driver, HomePageUI.REGISTER_LINK);
		clickToElement(driver, HomePageUI.REGISTER_LINK);
		return new PageGeneratorManager().getRegisterPage(driver);
		}

	public LoginPageObject clickToLoginLink() {
		waitForElementClickable(driver, HomePageUI.LOGIN_LINK);
		clickToElement(driver, HomePageUI.LOGIN_LINK);
		return new PageGeneratorManager().getLoginPage(driver);
	}

	public boolean isMyAccountLinkDisplayed() {
		waitForElementClickable(driver, HomePageUI.MY_ACCOUNT_LINK);
		return isElementDisplayed(driver, HomePageUI.MY_ACCOUNT_LINK);
	}

	public CustomerInforPageObject clickToMyAccountLink() {
		waitForElementClickable(driver, HomePageUI.MY_ACCOUNT_LINK);
		clickToElement(driver, HomePageUI.MY_ACCOUNT_LINK);
		return new PageGeneratorManager().getCustomerInforPage(driver);
    }
	
	public void closeSuccessMessage() {
		waitForElementClickable(driver, HomePageUI.SUCCESS_NOTI);
		clickToElement(driver, HomePageUI.SUCCESS_NOTI);
		sleepInSecond(3);
		}
}
