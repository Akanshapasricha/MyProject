package com.Utailer.Base;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class KeyWords extends BaseLibs{

	public static void Click(WebElement element)
	{
		element.click();
	}

	public static void SendData(WebElement element, String data)
	{
		element.sendKeys(data);
	}
	public static boolean display(WebElement element)
	{
		boolean displayed = element.isDisplayed();
		return displayed;
	}

	public static void mouseHover(WebElement element)
	{
		Actions action = new Actions(driver);

		action.moveToElement(element).build().perform();
	}
	public static int count(List<WebElement> ee)
	{
		int size = ee.size();
		return size;		
	}
}
