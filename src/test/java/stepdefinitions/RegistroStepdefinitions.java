package stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistroStepdefinitions {
	
	 WebDriver driver;

	@Given("El usuario esta en la pagina de registro")
	public void abrirPaginaDeInicioa() {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom/addcustomer.php");
	 
	}
	
	@When("Cuando ingresa datos validos")
	public void cuando_ingresa_datos_validos() {
		driver.findElement(By.xpath("//label[contains(text(),'Done')]")).click();
		driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("Milner");
		driver.findElement(By.xpath("//input[@id='lname']")).sendKeys("Bond");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("jalbak65@gmail.com");
		driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys("Esta es mi direccion");
		driver.findElement(By.xpath("//input[@id='telephoneno']")).sendKeys("343434556");

	}


	@When("da clic en submmit")
	public void da_clic_en_submmit() {
		driver.findElement(By.cssSelector("#main > div > form > div > div:nth-child(9) > ul > li:nth-child(1) > input[type=submit]")).click();
	  
	}


	@Then("El usuario puede ver que su registro halla sido exitoso")
	public void elUsuarioPuedeVerSuPanelDeAdministracion() throws InterruptedException {
		Assert.assertEquals(driver.findElement(By.xpath("//h1[contains(text(),'Access Details to Guru99 Telecom')]")).getText(), "Access Details to Guru99 Telecom");
		Thread.sleep(30000);
		driver.quit();

	}

}
