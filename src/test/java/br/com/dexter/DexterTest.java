package br.com.dexter;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
//import org.openqa.selenium.*;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.Select;

public class DexterTest {
//  private WebDriver driver;
//  private String baseUrl;
//  private boolean acceptNextAlert = true;
//  private StringBuffer verificationErrors = new StringBuffer();

//  @Before
//  public void setUp() throws Exception {
//     System.setProperty("webdriver.firefox.bin", "/home/gustavo/firefox42/firefox");
//     driver = new FirefoxDriver();
//     baseUrl = "https://www.4linux.com.br/";
//     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//  }

//  @Test
//  public void testAlou() throws Exception {
//     driver.get(baseUrl + "/");
//     driver.findElement(By.linkText("CURSOS")).click();
//     assertEquals("Cursos Linux, PHP, Segurança e Python | 4Linux", driver.getTitle());
//     driver.findElement(By.linkText("CONTATO")).click();
//     assertEquals("Fale Conosco, contato com a 4Linux | 4Linux", driver.getTitle());
//  }

//  @After
//  public void tearDown() throws Exception {
// //    driver.quit();
//     String verificationErrorString = verificationErrors.toString();
//     if (!"".equals(verificationErrorString)) {
//      fail(verificationErrorString);
//     }
//  }

//  private boolean isElementPresent(By by) {
//     try {
//      driver.findElement(by);
//      return true;
//     } catch (NoSuchElementException e) {
//      return false;
//     }
//  }

//  private boolean isAlertPresent() {
//     try {
//      driver.switchTo().alert();
//      return true;
//     } catch (NoAlertPresentException e) {
//      return false;
//     }
//  }

//  private String closeAlertAndGetItsText() {
//     try {
//      Alert alert = driver.switchTo().alert();
//      String alertText = alert.getText();
//      if (acceptNextAlert) {
//         alert.accept();
//      } else {
//         alert.dismiss();
//      }
//      return alertText;
//     } finally {
//      acceptNextAlert = true;
//     }
//  }
}
