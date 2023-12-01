package testesdesoftware.test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	protected static WebDriver driver;
//	private static final String URL_BASE = "https://www.google.com";
	private static final String URL_BASE = "file:///C:/Users/36124872022.1n/Downloads/sistema/login.html";
	private static final String PATH_DRIVE = "src/test/resources/chromedriver11906045.exe";
	
	@BeforeClass
	public static void iniciar() {
		
		System.setProperty("webdriver.chrome.driver", PATH_DRIVE);
		driver = new ChromeDriver(); //só abre navegador
		driver.manage().window().maximize(); //maximiza a janela do navegador
		driver.get(URL_BASE); // injeta um endereço no navegador e faz request
	}
	
	@AfterClass
	public static void finalizar() {
		driver.quit();
	}
}
