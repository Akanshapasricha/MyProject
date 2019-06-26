package com.Utailer.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class DeshBoardPages extends com.Utailer.Base.BaseLibs {
	public DeshBoardPages()   {
		PageFactory.initElements(driver, this);
	}

	public String validateDashboardPageTitle(){
		String title = driver.getTitle();
		return title;
	}
	@FindBy(xpath="//a[text()='Home']")
	WebElement homeLink;  @FindBy(xpath="//a[text()='Men']") WebElement menLink;
	public MenPages clickonMenLink()
	{
		menLink.click();
		return new MenPages();
	}
	public void checkboxBrand() {
		List<WebElement> chechboxList=driver.findElements(By.xpath("//input[@class='manufacturerproduct']"));
		int itemList=chechboxList.size();
		System.out.println("Afetr one checkbox size of product is:"+itemList);
	}
}
