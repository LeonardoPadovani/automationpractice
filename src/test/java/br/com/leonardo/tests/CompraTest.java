package br.com.leonardo.tests;

import org.testng.annotations.Test;

import br.com.leonardo.pages.WomanPage;

public class CompraTest extends BaseTest{
	
	private WomanPage womanPage = new WomanPage();
	
	@Test
	public void testComprar() {
		
		womanPage.clicarMenuWoman();
		womanPage.clicarMenuTops();
		womanPage.clicarSubCategoriesTshirts();
		womanPage.clicarImgTshirts();
		String precoShirt = womanPage.getPreco();
		System.out.println(precoShirt);
		womanPage.clicarBtnToCart();
		womanPage.clicarBtnContinueShoping();
		
		womanPage.clicarMenuWoman();
		womanPage.clicarMenuTops();
		womanPage.clicarSubCategoriesBlouses();
		womanPage.clicarImgBlouses();
		String precoBlouses = womanPage.getPreco();
		System.out.println(precoBlouses);
		womanPage.clicarBtnToCart();
		womanPage.clicarBtnProceedToCheckout();
		
	}

}
