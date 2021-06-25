package br.com.leonardo.pages;
import static br.com.leonardo.core.DriverFactory.getDriver;

public class HomePage extends BasePage {
	
	public HomePage() {
		super();
	}

	public void acessar() {
		getDriver().get("http://automationpractice.com/index.php");
	}
}
