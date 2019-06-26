package com.Utailer.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Utailer.Base.BaseLibs;
import com.Utailer.Base.KeyWords;
public class LoginPages extends BaseLibs {
	public LoginPages()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@name='useremail']")
	WebElement emailId;

	@FindBy(xpath="//input[@name='userpassword']")
	WebElement password;

	@FindBy(xpath="//input[@value='Login']")
	WebElement loginBtn;

	@FindBy(xpath="//a[text()='Forgot Password?']")
	WebElement forgotPassLink;
	public DeshBoardPages login(String emil,String pass) throws InterruptedException
	{
		KeyWords.SendData(emailId, emil);
		KeyWords.SendData(password, pass);
		KeyWords.Click(loginBtn);
		return new DeshBoardPages();
	}
}
