package br.senai.sp.atividadeencontro;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Teste 
{
	private WebDriver driver;
	
	@Before
	public void Setup() 
	{
		System.setProperty( "webdriver.chrome.driver", "C:\\Program Files\\chromedriver\\chromedriver.exe" );
		
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait( 2, TimeUnit.SECONDS );
		
		driver.manage().window().maximize();
	}
	
	@Test
	public void TesteNavegarParaSenai() 
	{
		driver.get( "http://online.sp.senai.br/" );
		
		driver.findElement( By.id("ImgLogo") ).click();
	}
	
	@After
	public void FecharNavegador() 
	{
		//driver.close();
	}
}
