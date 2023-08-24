package D12Exe;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	public static WebDriver driver;
	public static Select select;
	public static JavascriptExecutor js;
	public static WebElement element;
	
	public void browserLaunch(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions option = new ChromeOptions();
			option.addArguments("--disable-notifications");
			option.addArguments("--remote-allow-origins=*");
			 driver = new ChromeDriver(option);
			driver.manage().window().maximize();
		    
			
		}
		else if(browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.manage().window().maximize();
		}
	}
	
	public  static void  urlOpen() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	public static void selectElem(WebElement wel,int inx) {
		wel.click();
		Select sele = new Select(wel);
		sele.selectByIndex(inx);
	}
	public static void click(WebElement element) {
		element.click();

	}
	
	public static WebElement findElementByXpath(String xpath) {
		WebElement element = driver.findElement(By.xpath(xpath));
		return element;
	}
	public static WebElement findElementByID(String id) {
		WebElement element = driver.findElement(By.id(id));
		return element;

	}
	public static WebElement findElementByName(String name){
		WebElement element = driver.findElement(By.name(name));
		return element;
	}

	public static WebElement findElementByClass(String popup){
		WebElement element = driver.findElement(By.className(popup));
		return element;
	}
	public static WebElement findElementBytagName(String tagName){
		WebElement element = driver.findElement(By.tagName(tagName));
		return element;

	}
	public static List<WebElement> findElementsBytagName(String tagName){
		List<WebElement> element = driver.findElements(By.tagName(tagName));
		return element;

	}
	public static List<WebElement> findElementsByxpath(String xpath){
		List<WebElement> element = driver.findElements(By.tagName(xpath));
		return element;

	}


	public static WebElement findElementBylinkText(String linkText){
		WebElement element = driver.findElement(By.linkText(linkText));
		return element;

	}

	public static WebElement findElementBypartiallyLinkText(String partiallyLinkText){
		WebElement element = driver.findElement(By.partialLinkText(partiallyLinkText));
		return element;

	}
	public static WebElement findElementBycssSelector(String cssSelector){
		WebElement element = driver.findElement(By.cssSelector(cssSelector));
		return element;
	}

	public static void threadSleep(int time) throws InterruptedException {
		Thread.sleep(time);
	}

	public static void waits(int i) {
		driver.manage().timeouts().implicitlyWait(i,TimeUnit.SECONDS);
	}

	public static void  dataSend(WebElement element, String data) {
		element.sendKeys(data);

		
	}
	
	public static String getwindowHandleID () {
		String windID = driver.getWindowHandle();
		System.out.println(windID);
		return windID;
	}
	// Select Function

		public static void selectByIndex(WebElement element, int index) {
			select = new Select(element);
			select.selectByIndex(index);
		}
		public static void selectByValue(WebElement element, String value) {
			select = new Select(element);
			select.selectByValue(value);
		}
		public static void selectByText(WebElement element, String text) {
			select = new Select(element);
			select.selectByVisibleText(text);
		}
		
		
	public static void inputvalue(WebElement element,String text) {
		element.sendKeys(text);
		

	}
	
	public static void dropDownAllOptions(WebElement element) {
		Select s = new Select(element);
		List<WebElement> options = s.getOptions();
		for (int i = 0; i < options.size(); i++) {
			String data = options.get(i).getText();
			System.out.println(data);
		}

	}

	public static void radio(WebElement element) {
		WebElement radio = element;
		if (!radio.isSelected()) {
			radio.click();
		}
	}

	public static String Attribute(WebElement element) {
		String attribute = element.getAttribute("value");
		return attribute;
	}
	public static void close() {
		driver.close();
	}

	public static void getWebName() {
		String ttl= driver.getTitle();
		System.out.println(ttl);
	}

	
	
	public static void scrollToView(By a) {
		element = driver.findElement(a);
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
	}
	
}
