package br.com.leonardo.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import static br.com.leonardo.core.DriverFactory.getDriver;

public class BasePage {

	protected WebDriverWait wait;

	public BasePage() {
		this.wait = new WebDriverWait(getDriver(), 30);
		PageFactory.initElements(getDriver(), this);
	}

	public void esperarElemento(WebElement elemento) {
		this.wait.until((d) -> elemento.isDisplayed());
	}

}

