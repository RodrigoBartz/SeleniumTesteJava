package testesdesoftware.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class GoogleRefatoradoTest extends BaseTest{

	@Test
	public void pesquisarNoGoogle() {
		
		//preparação
		WebElement inputPesquisa = driver.findElement(By.name("q"));
		
		//execução
		inputPesquisa.sendKeys("bolo de laranja" + Keys.ENTER);
		
		String resultado = driver.findElement(By.id("result-stats")).getText();
		
		//verificação e análise
		assertTrue(resultado, resultado.contains("Aproximadamente"));
		
	}
}
