package D12Exe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class D12StepEx extends Base {

	D12PG orangePG;


	public static WebDriver driver;

	
	
	@When("Enter username and  password click login")
	public void enter_username_and_password_click_login() throws InterruptedException {
		orangePG = new D12PG(driver);
		Thread.sleep(2000);
		orangePG.orangeUserName.sendKeys(userName);
		orangePG.orangePassword.sendKeys(password);
		orangePG.orangeClick.click();
	}

	@When("Click on PIM then click Add Employee button")
	public void click_on_pim_then_click_add_employee_button() {
		orangePG.orangePIM.click();
		orangePG.orangeAddEmployee.click();
		
	}

	@When("Enter the  FirstName, Second Name and LastName and click on save button")
	public void enter_the_first_name_second_name_and_last_name_and_click_on_save_button() {
		orangePG.orangeFirstName.sendKeys(FName);
		orangePG.orangeFirstName.sendKeys(MName);
		orangePG.orangeFirstName.sendKeys(LName);
		orangePG.orangeSave.click();
	}

	@When("Navigate to Employee List")
	public void navigate_to_employee_list() {
		orangePG.orangeEmployeeList.click();
	}

	@Then("Add employee name and search and validate")
	public void add_employee_name_and_search_and_validate() {
		orangePG.orangeHints.sendKeys(FName);
		orangePG.orangeSearch.click();
	}


}
