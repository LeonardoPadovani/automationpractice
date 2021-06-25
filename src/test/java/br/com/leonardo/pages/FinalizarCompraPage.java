package br.com.leonardo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import br.com.leonardo.core.DSL;

public class FinalizarCompraPage extends BasePage{
	
	public FinalizarCompraPage () {
		super();
	}
	
	@FindBy(id = "total_price")
	private WebElement total;
	
	
	public String getPreco() {
		esperarElemento(this.total);
		DSL.executarJS("window.scrollBy(0,arguments[0])", this.total.getLocation().y);
		String total = this.total.getText();
		return total;
	}
	
}
