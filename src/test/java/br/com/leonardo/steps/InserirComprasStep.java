package br.com.leonardo.steps;

import static br.com.leonardo.core.DriverFactory.getDriver;
import static br.com.leonardo.core.DriverFactory.killDriver;

import org.testng.Assert;

import br.com.leonardo.pages.FinalizarCompraPage;
import br.com.leonardo.pages.HomePage;
import br.com.leonardo.pages.WomanPage;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class InserirComprasStep {
	
	private HomePage homePage = new HomePage();
	private WomanPage womanPage = new WomanPage();
	private FinalizarCompraPage finalizarCompraPage = new FinalizarCompraPage();
	
	@Given("que estou na home page do sistema")
	public void que_estou_na_home_page_do_sistema() {
		getDriver();
		homePage.acessar();
	}
	
	@When("eu adiciono produtos ao carrinho")
	public void eu_adiciono_produtos_ao_carrinho() {
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
	}
	
	@When("finalizo a compra")
	public void finalizo_a_compra() {
		womanPage.clicarBtnProceedToCheckout();
	}
	
	@Then("eu verifico o valor total de {string}")
	public void eu_verifico_o_valor_total_de(String totalEsperado) {
		String totalAtual = finalizarCompraPage.getPreco();
		System.out.println(totalAtual);
		Assert.assertEquals(totalAtual, totalEsperado);
	}

	 @After
	 public void fecharBrowser() {
	    killDriver();
	 }	
	

}
