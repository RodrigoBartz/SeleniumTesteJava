package testesdesoftware.test;

import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Keys;

import testesdesoftware.pageObject.GooglePO;

public class GoogleRefatorado2Test extends BaseTest{
	
	private static GooglePO googlePage;
	
	@BeforeClass
	public static void prepararTest() {
		driver.get("https://www.google.com");
		googlePage = new GooglePO(driver);
	}
	
	@Test
	public void pesquisarNoGoogle() {
				
		googlePage.inputPesquisa.sendKeys("bolo de laranja" + Keys.ENTER);
		
		String resultado = googlePage.divResultadoPesquisa.getText();	

		assertTrue(resultado, resultado.contains("Aproximadamente"));
		
	}
	
	@Test
	public void pesquisarNoGoogle2() {
		googlePage.inputPesquisa.sendKeys("bolo de banana" + Keys.ENTER);
		
		String resultado = googlePage.divResultadoPesquisa.getText();
		
		assertTrue(resultado, resultado.contains("resultados"));
	}

}
