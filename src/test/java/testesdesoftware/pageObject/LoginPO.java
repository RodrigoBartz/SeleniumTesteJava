package testesdesoftware.pageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPO extends BasePO {
	
	@FindBy(id = "email")
	public WebElement inputEmail;
	
	@FindBy(id = "senha")
	public WebElement inputSenha;
	
	@FindBy(id = "btn-entrar")
	public WebElement buttonEntrar;
	
	//pelo console do terminal: docment.querySelector('form>div.alert>span')
	//pelo console do terminal: docment.querySelector('form.form-login>div.alert>span')
	@FindBy(css = "form.form-login> div.alert>span")
	public WebElement spanMensagem;

	public LoginPO(WebDriver driver) {
		super(driver);
	}
	
	public String obterMensagem() {
		return this.spanMensagem.getText();
	}
	
	public void executarAcaoDeLogar(String email, String senha) {
		escrever(inputEmail, email);
		escrever(inputSenha, senha);
		buttonEntrar.click();
	}

	private void escrever(WebElement input, String texto) {
		input.clear();
		input.sendKeys(texto + Keys.TAB);
		
	}

}
