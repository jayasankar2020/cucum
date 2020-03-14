package com.stepdefinition;

import java.net.MalformedURLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class LibGlobal {

	public  WebDriver driver;
	
	  public static final String USERNAME = "jayasankar3";
	  public static final String AUTOMATE_KEY = "hfunwx2Vg7qzyC2eizxR";
	  public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

public WebDriver getDriverCloud() throws MalformedURLException {
    
    
    DesiredCapabilities caps = new DesiredCapabilities();
    caps.setCapability("browser", "Chrome");
    caps.setCapability("browser_version", "78.0");
    caps.setCapability("os", "Windows");
    caps.setCapability("os_version", "10");
    caps.setCapability("resolution", "1024x768");
    caps.setCapability("name", "Bstack-[Java] Sample Test");

    return  driver = new RemoteWebDriver(new java.net.URL(URL), caps);
	    
}
    
	public WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ADMIN\\eclipse-jayasankar\\Cucumber\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;

	}

	public void loadUrl(String url) {
		driver.get(url);

	}

	public void type(WebElement element, String name) {
		element.sendKeys(name);
	}

	public void btnClick(WebElement element) {
		element.click();
	}

	public void SelectTextByIndex(WebElement element, int index) {
		new Select(element).selectByIndex(index);
	}

	public void SelectTextByAttribute(WebElement element, String name) {
		new Select(element).selectByValue(name);

	}

	public String getTextByAttribute(WebElement element) {
		String attribute = element.getAttribute("value");
		return attribute;
	}

	public String getTitle() {
		return driver.getTitle();

	}

	public String generateRandomDate() {
		return new SimpleDateFormat("EEE_MM_dd_hhmmss").format(new Date());

	}
	/*
	 * public void ScreensShot() throws IOException { File Source
	 * =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); File destLoc =
	 * new File ("C:\\Users\\ADMIN\\eclipse-jayasankar\\Cucumber\\screenshot"+
	 * generateRandomDate() +" .png"); FileUtils.copyFile(Source, destLoc);
	 */

}
