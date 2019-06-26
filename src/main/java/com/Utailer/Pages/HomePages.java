package com.Utailer.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Utailer.Base.BaseLibs;
import com.Utailer.Base.KeyWords;

public class HomePages extends BaseLibs{
	@FindBy(xpath="//span[text()='Login']")
	WebElement homePageLoginlink;

	@FindBy(xpath="//a[@class='logo']")
	WebElement utailerLogo;

	public HomePages() 
	{
		PageFactory.initElements(driver, this);
	}

	public String validateHomePageTitle(){
		return driver.getTitle();
	}

	public boolean validUtailerImag()
	{
		return KeyWords.display(utailerLogo);
	}

	public LoginPages clickforLogin() throws InterruptedException {

		KeyWords.Click(homePageLoginlink);
		//homePageLoginlink.click();
		return new LoginPages();
	}
}
