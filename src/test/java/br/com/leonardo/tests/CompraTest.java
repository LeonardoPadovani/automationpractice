package br.com.leonardo.tests;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.util.concurrent.Uninterruptibles;

import br.com.leonardo.pages.FinalizarCompraPage;
import br.com.leonardo.pages.WomanPage;

public class CompraTest extends BaseTest{
	
	private WomanPage womanPage = new WomanPage();
	private FinalizarCompraPage finalizarCompraPage = new FinalizarCompraPage();
	
	@Test
	public void testComprar() {
		
		womanPage.clicarMenuWoman();
		womanPage.clicarMenuTops();
		womanPage.clicarSubCategoriesTshirts();
		womanPage.mouseOverImgTshirt();
		String precoShirt = womanPage.getPreco();
		System.out.println(precoShirt);
		womanPage.clicarBtnToCart();
		womanPage.clicarBtnContinueShoping();
		
		womanPage.clicarMenuWoman();
		womanPage.clicarMenuTops();
		womanPage.mouseOverImgTshirt();
		String precoShirtDois = womanPage.getPreco();
		System.out.println(precoShirtDois);
		womanPage.clicarBtnToCart();
		womanPage.clicarBtnProceedToCheckout();
		
		String total = finalizarCompraPage.getPreco();
		System.out.println(total);
		Assert.assertEquals(total, "$35.02");
		
		
	}

}
