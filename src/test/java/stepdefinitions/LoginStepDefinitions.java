package stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import userinterfaces.PaginaDeInicio;

public class LoginStepDefinitions {

	 WebDriver driver;

	@Given("El usuario esta en la pagina de login")
	public void abrirPaginaDeInicioa() {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http://demo.guru99.com/V4/");
	 
	}


	@When("Cuando ingresa credenciales validas")
	public void cuandoIngresaCredencialesValidas() {
		driver.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]")).sendKeys("mngr292085");
		driver.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys("ydynEra");
		

	}
	@When("da clic en login")
	public void daClicEnLogin() {
		driver.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]")).click();

	}
	@Then("El usuario puede ver su panel de administracion")
	public void elUsuarioPuedeVerSuPanelDeAdministracion() throws InterruptedException {
		Assert.assertEquals(driver.findElement(By.xpath("//td[contains(text(),'Manger Id : mngr292085')]")).getText(), "Manger Id : mngr292085");
		Thread.sleep(30000);
		driver.quit();

	}





	


}


