package testesdesoftware.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import testesdesoftware.pageObject.LoginPO;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LoginTest extends BaseTest {
	
	private static LoginPO loginPage;
	
	//abre navegador
	@BeforeClass
	public static void prepararTestes() {
		loginPage = new LoginPO(driver);
	}
	
	@Test
	public void TC001_naoDeveLogarNoSistemaComEmailESenhaVazio() {
//		loginPage.inputEmail.sendKeys("");
//		loginPage.inputSenha.sendKeys("");
//		loginPage.buttonEntrar.click();
		
		loginPage.executarAcaoDeLogar("", "");
		
		
		String mensagem = loginPage.obterMensagem();
		
		assertEquals(mensagem, "Informe usuário e senha, os campos não podem ser brancos.");
	}
}
