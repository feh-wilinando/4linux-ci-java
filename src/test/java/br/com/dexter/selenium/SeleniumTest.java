package br.com.dexter.selenium;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SeleniumTest {
	private WebDriver driver;
//	private HtmlUnitDriver driver;
	  private String baseUrl;
	  private boolean acceptNextAlert = true;
	  private StringBuffer verificationErrors = new StringBuffer();
	  protected static DesiredCapabilities dCaps;


	  @Before
	  public void setUp() throws Exception {
		  
		  DesiredCapabilities capabilities = DesiredCapabilities.phantomjs();
		  capabilities.setCapability("phantomjs.binary.path","/opt/phantomjs/bin/phantomjs");
		  driver = new PhantomJSDriver(capabilities);
		  
		  
	    baseUrl = "http://www.4linux.com.br/";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }

	  @Test
	  public void testAlou() throws Exception {
	    driver.get(baseUrl);
	    driver.findElement(By.linkText("CURSOS")).click();
	    assertEquals("Cursos Linux, PHP, Segurança e Python | 4Linux", driver.getTitle());
	    driver.findElement(By.linkText("CONTATO")).click();
	    assertEquals("Fale Conosco, contato com a 4Linux | 4Linux", driver.getTitle());
	  }

	  @After
	  public void tearDown() throws Exception {
	    driver.quit();
	    String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	      fail(verificationErrorString);
	    }
	  }

	  private boolean isElementPresent(By by) {
	    try {
	      driver.findElement(by);
	      return true;
	    } catch (NoSuchElementException e) {
	      return false;
	    }
	  }

	  private boolean isAlertPresent() {
	    try {
	      driver.switchTo().alert();
	      return true;
	    } catch (NoAlertPresentException e) {
	      return false;
	    }
	  }

	  private String closeAlertAndGetItsText() {
	    try {
	      Alert alert = driver.switchTo().alert();
	      String alertText = alert.getText();
	      if (acceptNextAlert) {
	        alert.accept();
	      } else {
	        alert.dismiss();
	      }
	      return alertText;
	    } finally {
	      acceptNextAlert = true;
	    }
	  }

}
