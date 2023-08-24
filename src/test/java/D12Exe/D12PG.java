package D12Exe;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class D12PG {

	public static WebDriver driver;

	 static String userName ="Admin";
	 static String password ="admin123";
	 static String FName ="Tharini";
	 static String MName ="KArthik";
	 static String LName ="Krit";
	 static String NewName ="Krifft";
	
	public D12PG(WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver ,this);
		
	}
	@FindBy (name ="username")
	public WebElement orangeUserName;
	
	@FindBy (name ="password")
	public WebElement orangePassword;
	
	@FindBy (xpath ="//button[@type='submit']")
	public WebElement orangeClick;
	
	@FindBy (xpath ="(//a[@class='oxd-main-menu-item'])[2]")
	public WebElement orangePIM;
	
	@FindBy (xpath = "//*[text()='Add Employee']")
	public WebElement orangeAddEmployee;
	
	@FindBy (name ="firstName")
	public WebElement orangeFirstName;
	
	@FindBy (name ="middleName")
	public WebElement orangeMiddleName;
	
	@FindBy (name ="lastName")
	public WebElement orangeLastName;
	
	@FindBy (xpath ="//button[@type='submit']")
	public WebElement orangeSave;
	
	@FindBy (xpath ="//a[text()='Employee List']")
	public WebElement orangeEmployeeList;
	
	@FindBy (xpath ="(//input[@placeholder='Type for hints...'])[1]")
	public WebElement orangeHints;
	
	@FindBy (xpath ="//button[@type='submit']")
	public WebElement orangeSearch;
	
	public void credentials(String username,String password) {
		orangeUserName.sendKeys("admin");
	}
	
}
