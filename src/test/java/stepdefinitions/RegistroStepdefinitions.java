package stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.Messages.Duration;

public class RegistroStepdefinitions {
	
	 WebDriver driver;
	 JavascriptExecutor js = (JavascriptExecutor) driver;

	@Given("El usuario esta en la pagina de registro")
	public void abrirPaginaDeInicioa() {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/telecom/addcustomer.php");
		WebDriverWait wait=new WebDriverWait(driver, 20);
	 
	}
	
	@When("Cuando ingresa datos validos")
	public void cuando_ingresa_datos_validos() {
	    driver.findElement(By.cssSelector(".\\32u:nth-child(1) > label")).click();
	    driver.findElement(By.id("fname")).sendKeys("miller");
	    driver.findElement(By.id("lname")).sendKeys("casierr");
	    driver.findElement(By.id("email")).sendKeys("elbichocr714@gmail.com");
	    driver.findElement(By.name("addr")).sendKeys("mi direccion");
	    driver.findElement(By.id("telephoneno")).sendKeys("1212121212");

	}


	@When("da clic en submmit")
	public void da_clic_en_submmit() throws InterruptedException {
		WebElement ele = driver.findElement(By.name("submit"));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click()", ele);
		
	  
	}


	@Then("El usuario puede ver que su registro halla sido exitoso")
	public void elUsuarioPuedeVerSuPanelDeAdministracion() {
		Assert.assertEquals(driver.findElement(By.xpath("//h1[contains(text(),'Access Details to Guru99 Telecom')]")).getText(), "Access Details to Guru99 Telecom");
		driver.quit();

	}

}
