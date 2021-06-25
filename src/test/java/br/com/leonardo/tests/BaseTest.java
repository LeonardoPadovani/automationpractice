package br.com.leonardo.tests;

import static br.com.leonardo.core.DriverFactory.getDriver;
import static br.com.leonardo.core.DriverFactory.killDriver;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import br.com.leonardo.pages.HomePage;


public class BaseTest {
	
	private HomePage homePage = new HomePage();
	
	@BeforeTest
	public void setupDriver() {
		getDriver();
		homePage.acessar();
	}

	@AfterTest
	public void quitDriver() {
		killDriver();
	}

}
