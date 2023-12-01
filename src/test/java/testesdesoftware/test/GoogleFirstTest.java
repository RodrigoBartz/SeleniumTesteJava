package testesdesoftware.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleFirstTest {
	
	private WebDriver driver;
	private String URL_BASE = "https://www.google.com";
	private String PATH_DRIVE = "src/test/resources/chromedriver11906045.exe";
	
	private void iniciar() {
		
		System.setProperty("webdriver.chrome.driver", PATH_DRIVE);
		driver = new ChromeDriver(); //só abre navegador
		driver.manage().window().maximize(); //maximiza a janela do navegador
		driver.get(URL_BASE); // injeta um endereço no navegador e faz request
	}
	
	@Test
	public void pesquisarNoGoogle() {
		//montagem do cenario
		iniciar();
		
		//preparação
		WebElement inputPesquisa = driver.findElement(By.name("q"));
		
		//execução
		inputPesquisa.sendKeys("bolo de laranja" + Keys.ENTER);
		
		String resultado = driver.findElement(By.id("result-stats")).getText();
		
		//verificação e análise
		assertTrue(resultado, resultado.contains("Aproximadamente"));
		
		driver.quit();
	}
	
}
