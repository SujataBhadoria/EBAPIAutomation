package com.edubrite.qa.user;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CurrencyConverter {

	public static WebDriver driver;
	public static Logger log = Logger.getLogger(CurrencyConverter.class);
	// public static String fromvalue = "INR – Indian Rupee";
	public static String tovalue = "GBP – British Pound";

	@Parameters("browser")
	@Test
	public static void initialize(String browser) {
		if (browser.equalsIgnoreCase("Chrome")) {

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			log.info("Chrome Browser Opening");
		}

		else if (browser.equalsIgnoreCase("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			log.info("Firefox Browser Opening");
		}

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.xe.com/currencyconverter/");
		log.info("URL Opening");
		driver.findElement(By.id("yie-close-button-b293f4ee-1fb2-5c4b-ba8b-b47ad54ee980")).click();
		// driver.findElement(By.id("midmarketFromCurrency")).click();

		/*
		 * List<WebElement> fromcurrencylist =
		 * driver.findElements(By.id("midmarketFromCurrency-listbox")); for (int i = 0;
		 * i <= (fromcurrencylist.size()) - 1; i++) {
		 * log.info(fromcurrencylist.get(i).getText()); log.info(fromvalue); if
		 * (fromcurrencylist.get(i).getText().contains(fromvalue)){
		 * log.info(fromvalue.equals(fromcurrencylist.get(i).getText()));
		 * fromcurrencylist.get(i).click(); } }
		 */

		driver.findElement(By.id("midmarketToCurrency")).click();
		List<WebElement> tocurrencylist = driver.findElements(By.id("midmarketToCurrency-listbox"));
		for (int i = 0; i <= (tocurrencylist.size()) - 1; i++) {
			log.info(tocurrencylist.get(i).getText());
			log.info(tovalue);
			if (tocurrencylist.get(i).getText().contains(tovalue)) {
				log.info(tocurrencylist.get(i).getText().contains(tovalue));
				tocurrencylist.get(i).click();
			}
		}
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[@class=\"result__BigRate-sc-1bsijpp-1 iGrAod\"]")));

		WebElement convertedcurrency = driver
				.findElement(By.xpath("//p[@class=\"result__BigRate-sc-1bsijpp-1 iGrAod\"]"));
		log.info(convertedcurrency.getText());

		// obtain text
		String s = convertedcurrency.getText();
		// write text to file

		File f = new File("savetxt.txt");
		try {
			FileUtils.writeStringToFile(f, s, Charset.defaultCharset());
		} catch (IOException exc) {
			exc.printStackTrace();
		}
		driver.quit();

	}

}
