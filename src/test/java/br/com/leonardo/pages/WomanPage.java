package br.com.leonardo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import br.com.leonardo.core.DSL;

public class WomanPage extends BasePage{
	
	public WomanPage() {
		super();
	}
	
	@FindBy(linkText = "Women")
	private WebElement menuWomen;
	
	@FindBy(xpath = "//div[@class='block_content']//a[normalize-space()='Tops']")
	private WebElement menuTops;
	
	@FindBy(xpath = "//a[@class='subcategory-name'][normalize-space()='T-shirts']")
	private WebElement subCategoriesTshirts;
	
	@FindBy(xpath = "//a[@class='subcategory-name'][normalize-space()='Blouses']")
	private WebElement subCategoriesBlouses;
	
	@FindBy(xpath = "//img[@title='Faded Short Sleeve T-shirts']")
	private WebElement imgTshirts;
	
	@FindBy(xpath = "//img[@title='Blouse']")
	private WebElement imgBlouse;
	
	@FindBy(id = "our_price_display")
	private WebElement preco;
	
	@FindBy(css = "button[name='Submit']")
	private WebElement btnAddToCart;
	
	@FindBy(css = "span[title='Continue shopping'] span:nth-child(1)")
	private WebElement btnContinueShopping;
	
	@FindBy(css = "a[title='Proceed to checkout'] span")
	private WebElement btnProceedToChekout;
	
	public void clicarMenuWoman() {
		esperarElemento(this.menuWomen);
		this.menuWomen.click();
	}
	
	public void clicarMenuTops() {
		esperarElemento(this.menuTops);
		this.menuTops.click();
	}
	
	public void clicarSubCategoriesTshirts() {
		esperarElemento(this.subCategoriesTshirts);
		DSL.executarJS("window.scrollBy(0,arguments[0])",this.subCategoriesTshirts.getLocation().y);
		this.subCategoriesTshirts.click();
	}
	
	public void clicarSubCategoriesBlouses() {
		esperarElemento(this.subCategoriesBlouses);
		DSL.executarJS("window.scrollBy(0,arguments[0])",this.subCategoriesBlouses.getLocation().y);
		this.subCategoriesBlouses.click();
	}
	
	public void clicarImgTshirts() {
		esperarElemento(this.imgTshirts);
		DSL.executarJS("window.scrollBy(0,arguments[0])",this.imgTshirts.getLocation().y);
		this.imgTshirts.click();
	}
	
	public void clicarImgBlouses() {
		esperarElemento(this.imgBlouse);
		DSL.executarJS("window.scrollBy(0,arguments[0])",this.imgBlouse.getLocation().y);
		this.imgBlouse.click();
	}
	
	public String getPreco() {
		esperarElemento(this.preco);
		String preco = this.preco.getText();
		return preco;
	}
	
	public void clicarBtnToCart() {
		esperarElemento(this.btnAddToCart);
		DSL.executarJS("window.scrollBy(0,arguments[0])",this.btnAddToCart.getLocation().y);
		this.btnAddToCart.click();
	}
	
	public void clicarBtnContinueShoping() {
		esperarElemento(this.btnContinueShopping);
		this.btnContinueShopping.click();
	}
	
	public void clicarBtnProceedToCheckout() {
		esperarElemento(this.btnProceedToChekout);
		this.btnProceedToChekout.click();
	}
	
	
	
	
	
	
	
	
	
	
}
