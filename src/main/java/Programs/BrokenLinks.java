package Programs;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BrokenLinks {
	
	public void brokenLinks(WebDriver driver) {
		driver.get("google.com");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total links are " + links.size());
		for (int i = 0; i < links.size(); i++) {
			String url = links.get(i).getAttribute("href");
			try {
				URL link = new URL(url);
				HttpURLConnection httpConn = (HttpURLConnection) link.openConnection();
				httpConn.setConnectTimeout(2000);
				httpConn.connect();
				if (httpConn.getResponseCode() == 200) {
					// log.info(url + " - " + httpConn.getResponseMessage());
				}
				if (httpConn.getResponseCode() >= 400) {
					System.out.println(url + " - " + httpConn.getResponseMessage());
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
