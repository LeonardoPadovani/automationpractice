package br.com.leonardo.core;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.google.common.util.concurrent.Uninterruptibles;

import static br.com.leonardo.core.DriverFactory.getDriver;

import java.util.concurrent.TimeUnit;

public class DSL {
	
	private static Actions action = new Actions(getDriver());
	
	public static Object executarJS(String cmd, Object... param) {
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		return js.executeScript(cmd, param);
	}
	
	public static void executarMouseOver(WebElement menu, WebElement SubMenu) {
		action.moveToElement(menu).perform();
		Uninterruptibles.sleepUninterruptibly(2,TimeUnit.SECONDS);
		action.moveToElement(SubMenu).click().perform();
	}

}
