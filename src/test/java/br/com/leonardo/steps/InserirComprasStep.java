package br.com.leonardo.steps;

import static br.com.leonardo.core.DriverFactory.getDriver;
import static br.com.leonardo.core.DriverFactory.killDriver;

import org.testng.Assert;

import br.com.leonardo.pages.FinalizarCompraPage;
import br.com.leonardo.pages.HomePage;
import br.com.leonardo.pages.WomanPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class InserirComprasStep {

	private HomePage homePage = new HomePage();
	private WomanPage womanPage = new WomanPage();
	private FinalizarCompraPage finalizarCompraPage = new FinalizarCompraPage();

	@Before
	public void setupDriver() {
		getDriver();

	}

	@Given("que estou na home page do sistema")
	public void que_estou_na_home_page_do_sistema() {
		homePage.acessar();
	}

	@When("eu seleciono um produto do menu women")
	public void eu_seleciono_um_produto_do_menu_women() {
		womanPage.clicarMenuWoman();
		womanPage.clicarMenuTops();
		womanPage.clicarSubCategoriesTshirts();
		womanPage.mouseOverImgTshirt();

	}

	@When("eu adiciono o produto ao carrinho")
	public void eu_adiciono_o_produto_ao_carrinho() {
		womanPage.clicarBtnToCart();
	}

	@When("eu continuo comprando")
	public void eu_continuo_comprando() {
		womanPage.clicarBtnContinueShoping();
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
	public void quitDriver() {
		killDriver();
	}

}
