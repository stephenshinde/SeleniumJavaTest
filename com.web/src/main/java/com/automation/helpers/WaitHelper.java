package com.automation.helpers;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class WaitHelper {
	
	
	
	public static void waituntillElementVisible(WebDriver driver,WebElement element ) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public static void waituntillElementTobeClickable(WebDriver driver,WebElement element ) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public static void waituntilltexttobePresentinElement(WebDriver driver,WebElement element, String text ) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.textToBePresentInElement(element, text));
		
	}
}
