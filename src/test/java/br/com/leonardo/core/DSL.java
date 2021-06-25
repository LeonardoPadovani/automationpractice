package br.com.leonardo.core;

import org.openqa.selenium.JavascriptExecutor;
import static br.com.leonardo.core.DriverFactory.getDriver;

public class DSL {
	
	public static Object executarJS(String cmd, Object... param) {
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		return js.executeScript(cmd, param);
	}

}
